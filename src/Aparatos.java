/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Aparatos {
    
    String nombre;
    String funcion;
    int edadmin;
    int edadmax;
    int idaparato;
    boolean baja;
    
    public Aparatos (String nuevonombre, String nuevafuncion, int nuevaedadmin, int nuevaedadmax, int nuevoid, boolean nuevabaja){
        nombre=nuevonombre;
        funcion=nuevafuncion;
        edadmin=nuevaedadmin;
        edadmax=nuevaedadmax;
        idaparato=nuevoid;
        baja=nuevabaja;
    }
    
    public Aparatos (){
        nombre="";
        funcion="";
        edadmin=0;
        edadmax=0;
        idaparato=0;
        baja=false;
    }
    
    public void Setnombre (String nuevonombre)
    {
        nombre=nuevonombre;
        
    }
    public String getnombre ()
    {
        return nombre;
    }
       public void Setfuncion (String nuevafuncion)
       {
        funcion=nuevafuncion;
        
    }
    public String getfuncion ()
    {
        return funcion;
    }
    public void Setedadmin (int nuevaedadmin)
    {
        edadmin=nuevaedadmin;
    }
    public int getedadmin ()
    {
        return edadmin;
    }
        public void Setedadmax (int nuevaedadmax)
        {
        edadmax=nuevaedadmax;
    }
    public int getedadmax ()
    {
        return edadmax;
    }
            public void Setid (int nuevaid)
        {
        idaparato=nuevaid;
    }
    public int getid ()
    {
        return idaparato;
    }
    public void Setbaja (boolean b)
    {
        baja=b;
    }
    public boolean getbaja ()
    {
        return baja;
    }
}
