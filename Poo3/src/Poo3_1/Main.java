package Poo3_1;

public class Main {
    /*public static void main(String[] args) {
        Coleccion<Integer> coleccionDeEnteros = new Coleccion<>();
        coleccionDeEnteros.agregar(1);
        coleccionDeEnteros.agregar(2);
        coleccionDeEnteros.agregar(3);

        System.out.println("Elementos en la colección de enteros:");
        for (int i = 0; i < coleccionDeEnteros.tamaño(); i++) {
            System.out.println(coleccionDeEnteros.obtener(i));
        }

        Coleccion<String> coleccionDeStrings = new Coleccion<>();
        coleccionDeStrings.agregar("Hola");
        coleccionDeStrings.agregar("Vero");

        System.out.println("\nElementos en la colección de cadenas:");
        for (int i = 0; i < coleccionDeStrings.tamaño(); i++) {
            System.out.println(coleccionDeStrings.obtener(i));
        }
    }*/

    /*public static void main(String[] args) {
        // Definir las dimensiones de la matriz tridimensional
        int x = 3; // Dimensión en x
        int y = 4; // Dimensión en y
        int z = 2; // Dimensión en z

        // Crear la matriz tridimensional
        Object[][][] matriz = new Object[x][y][z];

        // Llenar la matriz con objetos
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    // Puedes guardar cualquier tipo de objeto en la matriz
                    matriz[i][j][k] = new Matriz_3D(i, j, k); // Reemplaza MiObjeto con tu propio tipo de objeto
                }
            }
        }

        // Acceder a un elemento de la matriz
        int fila = 1; // Cambia estos valores según lo que necesites
        int columna = 2;
        int profundidad = 0;
        Object objeto = matriz[fila][columna][profundidad];

        // Hacer algo con el objeto
        if (objeto instanceof Matriz_3D) {
            Matriz_3D miObjeto = (Matriz_3D) objeto; // Convierte el objeto al tipo deseado
            System.out.println("Objeto en la posición [" + fila + "][" + columna + "][" + profundidad + "]: " + miObjeto.toString());
        } else {
            System.out.println("Objeto en la posición [" + fila + "][" + columna + "][" + profundidad + "] no es de tipo MiObjeto.");
        }
    }*/

    /*public static void main(String[] args) {
        Lista_Vinculada lista = new Lista_Vinculada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        System.out.print("Lista: ");
        lista.imprimir();

        lista.eliminar(2);

        System.out.print("Lista después de eliminar el 2: ");
        lista.imprimir();
    }*/

    public static void main(String[] args) {
        Coleccion_Controlada<String> coleccion = new Coleccion_Controlada<>(3);

        coleccion.agregarElemento("Elemento 1");
        coleccion.agregarElemento("Elemento 2");
        coleccion.agregarElemento("Elemento 3");
        coleccion.agregarElemento("Elemento 4"); // Este elemento no se agregará debido al límite

        coleccion.imprimirElementos();

        coleccion.eliminarElemento("Elemento 2");
        coleccion.imprimirElementos();
    }
}
