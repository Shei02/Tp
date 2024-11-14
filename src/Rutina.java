
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Rutina {
    ArrayList<Elementorutina> aparatos = new ArrayList ();
    int idrutina;
    
    public Rutina ( int nuevoid, ArrayList<Elementorutina> e){

        idrutina=nuevoid;
        aparatos=e;
    }
    
    public Rutina ()
    {
        idrutina=0;
    }
    
    public void Setaparatos (ArrayList <Elementorutina> e)
    {
        aparatos=e;
    }
    public  ArrayList<Elementorutina> getaparatos ()
    {
        return aparatos;
    }
    public void Setid (int nuevoid)
    {
        idrutina=nuevoid;
    }
    public int getid ()
    {
        return idrutina;
    }
}
