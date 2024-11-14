package poo4_1;

import java.util.ArrayList;
import java.util.List;
import poo4_1.Cereal;
import poo4_1.Lote;

public class Cooperativa {
    private List<Lote> lotesDisponibles;
    private List<Cereal> cerealesDisponibles;

    public Cooperativa() {
        lotesDisponibles = new ArrayList<>();
        cerealesDisponibles = new ArrayList<>();
    }

    public void agregarLote(Lote lote) {
        lotesDisponibles.add(lote);
    }

    public void agregarCereal(Cereal cereal) {
        cerealesDisponibles.add(cereal);
    }

    public void aconsejarSiembra(Lote lote) {
        for (Cereal cereal : cerealesDisponibles) {
            if (lote.satisfaceRequerimientos(cereal)) {
                System.out.println("Se puede sembrar " + cereal.getNombre() + " en el lote " + lote.getId());
            }
        }
    }

    public List<Lote> listarLotesParaCereal(Cereal cereal) {
        List<Lote> lotesParaCereal = new ArrayList<>();
        for (Lote lote : lotesDisponibles) {
            if (lote.satisfaceRequerimientos(cereal)) {
                lotesParaCereal.add(lote);
            }
        }
        return lotesParaCereal;
    }

    public boolean esLoteEspecial(Lote lote) {
        return lote.esComun();
    }
}
