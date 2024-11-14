package Poo3_1;

public class Lista_Vinculada {
        private Nodo cabeza;

        public Lista_Vinculada() {
            cabeza = null;
        }

        // Método para agregar un elemento al final de la lista
        public void agregar(int dato) {
            Nodo nuevoNodo = new Nodo(dato);
            if (cabeza == null) {
                cabeza = nuevoNodo;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoNodo;
            }
        }

        // Método para eliminar un elemento de la lista
        public void eliminar(int dato) {
            if (cabeza == null) {
                return;
            }

            if (cabeza.dato == dato) {
                cabeza = cabeza.siguiente;
                return;
            }

            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.siguiente.dato == dato) {
                    actual.siguiente = actual.siguiente.siguiente;
                    return;
                }
                actual = actual.siguiente;
            }
        }

        // Método para imprimir la lista
        public void imprimir() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }

    }

