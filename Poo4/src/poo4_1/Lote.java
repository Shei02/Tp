package poo4_1;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int id;
    private double superficie;
    private List<String> minerales;
    private boolean esEspecial;

    public Lote(int id, double superficie, List<String> minerales, boolean esEspecial) {
        this.id = id;
        this.superficie = superficie;
        this.minerales = minerales;
        this.esEspecial = esEspecial;
    }

    public int getId() {
        return id;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean satisfaceRequerimientos(Cereal cereal) {
        List<String> requerimientos = cereal.getMineralesRequeridos();
        return minerales.containsAll(requerimientos);
    }

    public boolean esComun() {
        return !esEspecial;
    }
}
