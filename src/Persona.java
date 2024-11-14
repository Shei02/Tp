/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    String fechan;
    String direccion;
    String tel;
    int idpersona;
    boolean ficha;
    boolean activo;
    
    public Persona (String nuevonombre, String nuevoapellido, int nuevaedad, String nuevafecha, String nuevadir, String nuevotel, int nuevoid, boolean nuevaficha, boolean nuevoactivo){
      nombre=nuevonombre;
      apellido=nuevoapellido;
      edad=nuevaedad;
      fechan=nuevafecha;
      direccion=nuevadir;
      tel=nuevotel;
      idpersona=nuevoid;
      ficha=nuevaficha;
      activo=nuevoactivo;
    }
    
    public Persona (){
      nombre="";
      apellido="";
      edad=0;
      fechan="";
      direccion="";
      tel="";
      idpersona=0;
      ficha=false;
      activo=false;
    }
     public void Setnombre (String nuevonombre){
         nombre=nuevonombre;
     }
    public String getnombre (){
        return nombre;
    }
         public void Setapellido (String nuevoapellido){
         apellido=nuevoapellido;
     }
    public String getapellido (){
        return apellido;
    }
         public void Setedad (int nuevaedad){
         edad=nuevaedad;
     }
    public int getedad (){
        return edad;
    }
         public void Setfecha (String nuevafecha){
         fechan=nuevafecha;
     }
    public String getfecha (){
        return fechan;
    }
         public void Setdireccion (String nuevadir){
         direccion=nuevadir;
     }
    public String getdireccion (){
        return direccion;
    }
         public void Settelefono (String nuevotel){
         tel=nuevotel;
     }
    public String gettelefono (){
        return tel;
    }
    
    public void Setid (int nuevoid)
    {
        idpersona=nuevoid;
    }
    public int getid ()
    {
        return idpersona;
    }
    public void setficha (boolean f)
    {
        ficha=f;
    }
    public boolean getficha ()
    {
        return ficha;
    }
        public void setactivo (boolean a)
    {
        activo=a;
    }
    public boolean getactivo ()
    {
        return activo;
    }
    
}
