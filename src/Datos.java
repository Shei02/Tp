
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony Vaio
 */
public class Datos {
    
    public Datos(ArrayList<Persona> LPersona, ArrayList<Aparatos> LAparatos, ArrayList<Horarios> LHorarios) throws IOException{
    
    
        
     ArrayList<String> datospersonas = LeerDatos("personas.txt");
     ArrayList<String> datosaparatos = LeerDatos("aparatos.txt");
     ArrayList<String> datoshorarios = LeerDatos("horarios.txt");
    
     //armar objeto persona con cada fila y pasar a arraylist
     int id=0;
     for (String i:datospersonas){
     
        
        
        String[] info = i.split(",");
                
        
        Persona p = new Persona(info[0],info[1],Integer.parseInt(info[2]),info[3],info[4],info[5],id,Boolean.parseBoolean(info[6]),Boolean.parseBoolean(info[7]));
        
        LPersona.add(p);
        
        id++;
        
       
     }
     
     //armar objeto aparato con cada fila y pasar a arraylist
     id=0;
     for (String i:datosaparatos){
     
        
        String[] info = i.split(",");
        
        Aparatos a = new Aparatos(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]), id, Boolean.parseBoolean(info[4]));
        
        LAparatos.add(a);
        id++;
       
     }
    
     //armar objeto horario con cada fila y pasar a arraylist
     id=0;
     for (String i:datoshorarios){
     
        
        String[] info = i.split(",");
        
        Horarios h = new Horarios(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]), id);
                
        LHorarios.add(h);
        id++;
       
     }
    }
    
    public ArrayList<String> LeerDatos(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        
        ArrayList<String> datos = new ArrayList();
        
        
        
        FileReader f = new FileReader(archivo);
        //BufferedReader b = new BufferedReader(f);
        
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"ISO-8859-1"));
        
        while((cadena = b.readLine())!=null) {
            
            datos.add(cadena);
        }
        b.close();
        
        return datos;
    }
    
}
