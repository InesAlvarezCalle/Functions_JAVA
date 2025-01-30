package FuncionesII;

public class Funciones {
    public static void mostarVectorInt(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length -1){
                System.out.print(vector[i] + " - ");
            } else {
                System.out.print(vector[i]);
                System.out.println();
            }
        }
    }

    public static void mostarMatrizInt(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz.length -1){
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static void copia2Vectores(int[] vector1, int[] vector2){

    }

    public static void copiarVector(int[] vector){

    }

    public static boolean igualesVectores(int[] vector1, int[] vector2){
        return false;
    }

    public static int[] vectorAleatorio(int tamanyo){
        int[] vector = new int[tamanyo];
        return vector;
    }

    public static int mediaVector(int vector){
        return 0;
    }

    public static boolean esMayorEdad(int edad){
        return false;
    }

    public static int fibonnaci(int num){
        return 0;
    }

    public static void aproximaPhi(int num){

    }
}
