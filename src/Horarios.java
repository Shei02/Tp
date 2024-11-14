/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Horarios {
    String dia;
    int horaini;
    int horafin;
    int cantpersonas;
    int idhorario;
    
    public Horarios (String nuevodia, int nuevahoraini, int nuevahorafin, int nuevacantpersonas, int nuevoidhorario)
    {
        dia=nuevodia;
        horaini=nuevahoraini;
        horafin=nuevahorafin;
        cantpersonas=nuevacantpersonas;
        idhorario=nuevoidhorario;
    }
    
    public Horarios ()
    {
        dia="";
        horaini=0;
        horafin=0;
        cantpersonas=0;
        idhorario=0;
    }
    
    public void Setdia (String nuevodia)
    {
     dia=nuevodia;   
    }
    public String getdia ()
    {
        return dia;
    }
    public void Sethoraini (int nuevahoraini)
    {
        horaini=nuevahoraini;
        
    }
    public int gethoraini ()
    {
        return horaini;
    }
        public void Sethorafin (int nuevahorafin)
    {
        horafin=nuevahorafin;
        
    }
    public int gethorafin ()
    {
        return horafin;
    }
    
    public void Setcantpersona (int nuevacantpersonas)
    {
        cantpersonas=nuevacantpersonas;
    }
    public int getcantpersonas ()
    {
        return cantpersonas;
    }
        public void Setidhorario (int nuevoidhorario)
    {
        idhorario=nuevoidhorario;
    }
    public int getidhorario ()
    {
        return idhorario;
    }
    
}
