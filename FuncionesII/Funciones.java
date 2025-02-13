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

        for (int i = 0; i < tamanyo; i++) {
            vector[i] = (int)(Math.random() * 100);
        }
        return vector;
    }

    public static double mediaVector(int[] vector){
        double suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma/vector.length;
    }

    public static boolean esMayorEdad(int edad){
        if(edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static int totalMenores(int[] edades){
        int contador = 0;

        for(int edad : edades){
            if(!esMayorEdad(edad) ){
                contador ++;
            }
        }
        return contador;
    }

    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num -2);
        }
    }

    public static void aproximaPhi(int num){
        int[] fibonacciSeries = new int[num];

        for (int i = 0; i < num; i++) {
            fibonacciSeries[i] = Funciones.fibonacci(i);
        }

        for (int i = 1; i < num; i++) {
            double cociente = (double) fibonacciSeries[i]/fibonacciSeries[i - 1];
            System.out.println("Cociente Fibonacci[" + i + "] / Fibonacci[" + i + "] = " + cociente);
        }
    }
}
