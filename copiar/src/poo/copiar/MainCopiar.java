package poo.copiar;

import poo.copiar.modelo.Archivo;
import poo.copiar.modelo.Directorio;
import poo.copiar.utils.Datos;

public class MainCopiar {

  public static void main(String[] args) {
    // copiar basico
    Archivo archivo = new Archivo("poo.txt", 100);

//    // MAL: copia referencia
//    Archivo copia = archivo;
//    copia.setTamanio(101);
//    System.out.println("Original: " + archivo);
//    System.out.println("Copia: " + copia);

//    // MAL: metodo copia devuelve this
//    Archivo copia = archivo.copiar();
//    copia.setTamanio(101);
//    System.out.println("Original: " + archivo);
//    System.out.println("Copia: " + copia);

//    // copiar
//    Archivo copia = archivo.copiar();
//    copia.setTamanio(101);
//    System.out.println("Original: " + archivo);
//    System.out.println("Copia: " + copia);

      // copiar compuesto
    Directorio raiz = Datos.getRaiz();
    Directorio copia = raiz.copiar();
    copia.setNombre("copia");
    System.out.println("Original: " + raiz);
    System.out.println("Copia: " + copia);
  }

}
