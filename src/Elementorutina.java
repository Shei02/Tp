/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Elementorutina {
    int ide;
    int idaparato;
    int minutos;
           
    public Elementorutina (int nuevoide, int nuevoidaparato, int nuevominutos)
    {
        ide=nuevoide;
        idaparato=nuevoidaparato;
        minutos=nuevominutos;
    }
    
    public void Setide (int nuevoide)
    {
        ide=nuevoide;
    }
    public int getide ()
    {
        return ide;
    }
        public void Setidaparato (int nuevoidaparato)
    {
        idaparato=nuevoidaparato;
    }
    public int getidaparato ()
    {
        return idaparato;
    }
        public void Setminutos (int nuevominutos)
    {
        minutos=nuevominutos;
    }
    public int getminutos ()
    {
        return minutos;
    }
    
}
