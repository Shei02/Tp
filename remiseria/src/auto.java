/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class auto {
    
    int idauto;
    String modelo;
    String marca;
    int patente;
    
   public auto(int nuevoid, String nuevomodelo, String nuevamarca, int nuevapatente){
       
       idauto=nuevoid;
       modelo=nuevomodelo;
       marca=nuevamarca;
       patente=nuevapatente;
   }
    
   public auto(){
       
       idauto=0;
       modelo="";
       marca="";
       patente=0;
   }
   
   public void Setidauto(int nuevoidauto)
   {
       idauto=nuevoidauto;
   }
   public int getidauto()
   {
       return idauto;
   }
   public void Setmodeloo(String nuevomodelo)
   {
       modelo=nuevomodelo;
   }
   public String getmodelo()
   {
       return modelo;
   }
   public void Setmarca( String nuevamarca)
   {
       marca=nuevamarca;
   }
   public String getmarca()
   {
       return marca;
   }
   public void Setpatente(int nuevapatente)
   {
       patente=nuevapatente;
   }
   public int getpatente()
   {
       return patente;
   }
   
}
