package FuncionesII;

public class Main {
   public static void main(String[] args) {
       int opcion, num1, num2;
       int[] vector1, vector2 = new int[10], vectorCopia;
       int[][] matriz1;

       do {
           System.out.println("1. MostrarVectorInt");
           System.out.println("2. MostrarMatrizInt");
           System.out.println("3. Copiar2Vectores");
           System.out.println("4. CopiarVector");
           System.out.println("5. IgualesVectores");
           System.out.println("6. VectorAleatorio");
           System.out.println("7. MediaVector");
           System.out.println("8. EsMayorEdad");
           System.out.println("9. Fibonacci");
           System.out.println("10. AproximaPhi");
           System.out.println("0- SALIR");

           opcion = Leer.leerEntero("Seleccione la opcion que desea usar: ");

           switch (opcion){
               case 0:
                   System.out.println("¡Hasta pronto!");
                   break;
               case 1:
                   num1 = Leer.leerEntero("Introduzca la longitud del vector: ");
                   vector1 = new int [num1];
                   for (int i = 0; i < num1; i++) {
                       vector1[i] = Leer.leerEntero("Introduzca un número: ");
                   }
                   System.out.println("Mostrando vector:");
                   Funciones.mostarVectorInt(vector1);
                   break;
               case 2:
                   num1 = Leer.leerEntero("Introduce el número de filas: ");
                   num2 = Leer.leerEntero("Introduce el número de columnas: ");
                   matriz1 = new int [num1][num2];
                   for (int i = 0; i < num1; i++) {
                       for (int j = 0; j < num2; j++) {
                           matriz1[i][j] = Leer.leerEntero("Introduce el número para la posición " + i + j + " : ");
                       }
                   }
                   Funciones.mostarMatrizInt(matriz1);
                   break;
               case 3:
                    num1 = Leer.leerEntero("Introduzca de longitud del vactor origen: ");
                    vector1 = new int[num1];
                   for (int i = 0; i < num1; i++) {
                       vector1[i] = Leer.leerEntero("Introduce un número: ");
                   }
                   Funciones.copia2Vectores(vector1,vector2);
                   for (int i = 0; i < vector2.length; i++) {
                       System.out.print(vector2[i]);
                       if (i < vector2.length -1){
                           System.out.print(" - ");
                       }
                   }
                   System.out.println();
                   break;
               case 4:
                   num1 = Leer.leerEntero("Introduzca de longitud del vactor origen: ");
                   vectorCopia = new int[num1];
                   for (int i = 0; i < num1; i++) {
                       vectorCopia[i] = Leer.leerEntero("Introduce un número: ");
                   }
                   Funciones.copiarVector(vectorCopia);
                   break;
               case 5:
                   num1 = Leer.leerEntero("Introduzca de longitud del vactor origen: ");
                   vector1 = new int[num1];
                   for (int i = 0; i < num1; i++) {
                       vector1[i] = Leer.leerEntero("Introduce un número: ");
                   }

                   num1 = Leer.leerEntero("Introduzca de longitud del vactor origen: ");
                   vector2 = new int[num1];
                   for (int i = 0; i < num1; i++) {
                       vector2[i] = Leer.leerEntero("Introduce un número: ");
                   }

                   if(Funciones.igualesVectores(vector1,vector2)){
                       System.out.println("Los dos vectores son iguales");
                   } else {
                       System.out.println("Los dos vectores son diferentes");
                   }
                   break;
               case 6:
                   num1 = Leer.leerEntero("Intruduce el tamaño del vector: ");
                   Funciones.vectorAleatorio(num1);
                   for(int num : Funciones.vectorAleatorio(num1)){
                       System.out.print(num + " ");
                       System.out.println();
                   }
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   break;
               default:
                   System.out.println("ERROR: El número no es correcto");
           }
       } while (opcion != 0);
   }
}
