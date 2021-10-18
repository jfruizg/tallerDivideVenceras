package co.edu.unbosque.model;

public class productoMatrices {

    public static String llenarmatriz(String tamañoMatriz_A, String tamañoMatriz_B) {
        int mat[][];
        int a = Integer.parseInt(tamañoMatriz_A);
        int b = Integer.parseInt(tamañoMatriz_B);

        mat = new int[a][a];

        llenarmatriz2(mat = new int[a][b], a);

        return "";

    }

}
