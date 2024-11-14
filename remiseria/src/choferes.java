/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class choferes {
    String nombre;
    String apellido;
    int dni;
    int idchofer;
    
    
    public choferes(String nuevonombre, String nuevoapellido, int nuevodni, int nuevoid){
        
        nombre= nuevonombre;
        apellido=nuevoapellido;
        dni=nuevodni;
        idchofer=nuevoid;
        
    }
            
    
    

    public choferes(){
        
        nombre="";
        apellido="";
        dni=0;
        idchofer=0;
    }
    
    public  void Setnombre (String nuevonombre)
    {
        nombre=nuevonombre;
    }
       public String getinombre ()
    {
        return nombre;
    }
       
        public  void Setapellido (String nuevoapellido)
    {
        apellido=nuevoapellido;
    }
       public String getapellido ()
    {
        return apellido;
    }
       
    public void Setdni (int nuevodni)
    {
        dni=nuevodni;
    }
    public int getdni()
    {
        return dni;
    }
    
    public void Setidchofer (int nuevoidchofer)
    {
        idchofer=nuevoidchofer;
    }
    public int getidchofer()
    {
        return idchofer;
    }

}