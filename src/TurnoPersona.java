
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
public class TurnoPersona {
    int idturnopers;
    int idpersona;
    ArrayList<Turno> misturnos= new ArrayList ();
    
    public TurnoPersona (int nuevoidturnopers, int nuevoidpersona, ArrayList<Turno> t)
    {
        idturnopers=nuevoidturnopers;
        idpersona=nuevoidpersona;
        misturnos=t;
    }
    public TurnoPersona ()
    {
        idturnopers=0;
        idpersona=0;
        
    }
    public void Setidturnopers ( int nuevoidturnopers)
    {
        idturnopers=nuevoidturnopers;
    }
    public int getidturnopers ()
    {
        return idturnopers;
    }
    public void Setidpersona ( int nuevoidpersona)
    {
        idpersona=nuevoidpersona;
    }
    public int getidpersona ()
    {
        return idpersona;
    }
    public void Setmisturnos (ArrayList<Turno> t)
    {
        misturnos=t;
    }
    public ArrayList<Turno> getmisturnos ()
    {
        return misturnos;
    }
}
