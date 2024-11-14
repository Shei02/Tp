package Poo3_1;

public class Matriz_3D {
    // Clase de ejemplo para el tipo de objeto que deseas guardar en la matriz
    //class MiObjeto {
        int valorX;
        int valorY;
        int valorZ;

        public Matriz_3D(int x, int y, int z) {
            this.valorX = x;
            this.valorY = y;
            this.valorZ = z;
        }

        @Override
        public String toString() {
            return "MiMatriz [X=" + valorX + ", Y=" + valorY + ", Z=" + valorZ + "]";
        }
}

