package poo5_1;

public class Main {
    public static void main(String[] args){
        CentroComputo centro = new CentroComputo();

        centro.aggComputadora(new Computadora("PC1",4));
        centro.aggComputadora(new Computadora("PC2",8));
        centro.aggComputadora(new Computadora("PC3",6));

        centro.aggProceso(new Proceso("Proceso1",2));
        centro.aggProceso(new Proceso("Proceso2",4));
        centro.aggProceso(new Proceso("Proceso3",6));
        centro.aggProceso(new Proceso("Proceso4",8));

        centro.ejecutarProcesos();
    }
}
