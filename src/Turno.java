/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Turno {
    int idturno;
    int idrutina;
    int idhorario;
    
    public Turno (int nuevoidturno, int nuevoidrutina, int nuevoidhorario)
    {
        idturno= nuevoidturno;
        idrutina=nuevoidrutina;
        idhorario=nuevoidhorario;
    }
    
    public Turno ()
    {
        idturno=0;
        idrutina=0;
        idhorario=0;
    }
    
    public void Setidturno (int nuevoidturno)
    {
        idturno=nuevoidturno;
    }
    public int getidturno ()
    {
        return idturno;
    }
        public void Setidrutina (int nuevoidrutina)
    {
        idrutina=nuevoidrutina;
    }
    public int getidrutina ()
    {
        return idrutina;
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
