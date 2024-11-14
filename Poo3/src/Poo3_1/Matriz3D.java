package Poo3_1;

public class Matriz3D {
    int valorX;
    int valorY;
    int valorZ;

    public Matriz3D(int x, int y, int z) {
        this.valorX = x;
        this.valorY = y;
        this.valorZ = z;
    }

    public String toString() {
        return "MiMatriz [X=" + this.valorX + ", Y=" + this.valorY + ", Z=" + this.valorZ + "]";
    }
}