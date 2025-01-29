package FuncionesII;

public class Main {
   public static void main(String[] args) {
       int opcion;
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
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   break;
               case 0:
                   break;
           }
       } while (opcion != 0);
   }
}
