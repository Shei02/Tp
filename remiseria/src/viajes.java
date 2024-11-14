/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class viajes {
    String fecha;
    String hora;
    int idauto;
    int idchofer;
    String origen;
    String destino;
    
    
    public viajes(String nuevafecha, String nuevahora, int nuevoidauto, int nuevoidchofer, String nuevoorigen, String nuevodestino){
        
        fecha=nuevafecha;
        hora=nuevahora;
        idauto=nuevoidauto;
        idchofer=nuevoidchofer;
        origen=nuevoorigen;
        destino=nuevodestino;
    }
    
    
    public viajes(){
        
        fecha="";
        hora="";
        idauto=0;
        idchofer=0;
    }
    
    public void Setfecha (String nuevafecha)
    {
        fecha=nuevafecha;
    }
    public String getfecha()
    {
        return fecha;
    }
    
    public void Sethora (String nuevahora)
    {
        hora=nuevahora;
    }
    public String gethora()
    {
        return hora;
    }
    
    public void Setidauto (int nuevoidauto)
    {
        idauto=nuevoidauto;
    }
    public int getidauto()
    {
        return idauto;
    }
    
    public void Setidchofer (int nuevoidchofer)
    {
        idchofer=nuevoidchofer;
    }
    public int getidchofer()
    {
        return idchofer;
    }
    
    public void Setorigen (String nuevoorigen)
    {
        origen=nuevoorigen;
    }
    public String getorigen()
    {
        return origen;
    }
    
     public void Setdestino (String nuevodestino)
    {
        destino=nuevodestino;
    }
    public String getdestino()
    {
        return destino;
    }
    
}
