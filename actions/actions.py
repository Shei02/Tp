# This files contains your custom actions which can be used to run
# custom Python code.
#
# See this guide on how to implement these action:
# https://rasa.com/docs/rasa/custom-actions


# This is a simple example for a custom action which utters "Hello World!"

# from typing import Any, Text, Dict, List
#
# from rasa_sdk import Action, Tracker
# from rasa_sdk.executor import CollectingDispatcher
#
#
# class ActionHelloWorld(Action):
#
#     def name(self) -> Text:
#         return "action_hello_world"
#
#     def run(self, dispatcher: CollectingDispatcher,
#             tracker: Tracker,
#             domain: Dict[Text, Any]) -> List[Dict[Text, Any]]:
#
#         dispatcher.utter_message(text="Hello World!")
#
#         return []
from rasa_sdk import Action, Tracker
from rasa_sdk.executor import CollectingDispatcher
from typing import Any, Text, Dict, List
from swiplserver import PrologMQI
from rasa_sdk.events import SlotSet

class ActionRetornaPeli(Action):
    def name(self) -> Text:
        return "action_retorna_peli"

    def run(self, dispatcher: CollectingDispatcher, tracker: Tracker, domain: Dict[Text, Any]) -> List[Dict[Text, Any]]:
        consulta_prolog = "recomendar_pelicula_sorp(Recomendacion)"
 
        with PrologMQI() as mqi:
            with mqi.create_thread() as prolog_thread:
                prolog_thread.query("consult('C:/Users/Belu/Documents/Prolog/InfoNetflix - copia.pl')")
                resultado = prolog_thread.query(consulta_prolog)

                if resultado and 'Recomendacion' in resultado[0]:
                    recomendacion = resultado[0]['Recomendacion'][0]
                    resultado_texto = str(recomendacion)

                    SlotSet("nombre_recom", recomendacion)

                    dispatcher.utter_message(text=f"La pelicula que te recomiendo es: {resultado_texto}")
        return []









