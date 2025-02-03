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

    public static int[] copia2Vectores(int[] vectorOrigen, int[] vectorDestino){
        if(vectorOrigen.length != vectorDestino.length){
            System.out.println("ERROR: Los vectores no tienen el mismo tamaño.");
            return vectorDestino;
        }

        for (int i = 0; i < vectorOrigen.length; i++) {
            vectorDestino[i] = vectorOrigen[i];
        }
        return vectorDestino;
    }

    public static int[] copiarVector(int[] vector){
        int[] vectorDestino = new int[vector.length];
        return copia2Vectores(vector,vectorDestino);
    }

    public static boolean igualesVectores(int[] vector1, int[] vector2){
        if(vector1.length != vector2.length){
            return false;
        }

        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i] != vector2[i]){
                return false;
            }
        }

        return true;
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
