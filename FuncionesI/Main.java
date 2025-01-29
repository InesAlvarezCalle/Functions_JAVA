package FuncionesI;

public class Main {
    public static void main(String[] args) {
        int opcion, num1, num2, num3, resultado;
        double cant, cantDesc;
        do {
            System.out.println("-----------------------------------");
            System.out.println("MENÚ");
            System.out.println("-----------------------------------");
            System.out.println("1. Imprimir tabla de multiplicar");
            System.out.println("2. Multiplicar dos números");
            System.out.println("3. Comprobar Pitágoras");
            System.out.println("4. calcular porcentaje descuento");
            System.out.println("5. Decir positivo, negativo o cero");
            System.out.println("6. Pasar de millas a kilómetros");
            System.out.println("7. SALIR");
            System.out.println("-----------------------------------");
            opcion = Leer.leerEntero("Selecciona la opción que desea hacer: ");

            switch (opcion) {
                case 1:
                    num1 = Leer.leerEntero("Introduce el número de la tabla que quieras ver: ");
                    tablaMul(num1);
                    System.out.println();
                    break;
                case 2:
                    num1 = Leer.leerEntero("Introduce el primer número: ");
                    num2 = Leer.leerEntero("Introduce el segundo número: ");
                    resultado = multiplica(num1,num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    System.out.println();
                    break;
                case 3:
                    num1 = Leer.leerEntero("Introduce el primer número: ");
                    num2 = Leer.leerEntero("Introduce el segundo número: ");
                    num3 = Leer.leerEntero("Introduce el tercer numero: ");
                    if (esPitagoras(num1,num2,num3)){
                        System.out.println("Sí que es Pitágoras");
                    } else {
                        System.out.println("No es Pitágoras");
                    }
                    System.out.println();
                    break;
                case 4:
                    cant = Leer.leerDouble("Introduce la cantidad: ");
                    cantDesc = Leer.leerDouble("Introduce la cantidad de descuento: ");

                    System.out.println("El porcentaje de decuento es: " + Calculos.queDescuento(cant,cantDesc) + "%");
                    break;
                case 5:
                    num1 = Leer.leerEntero("Introduce un número para saber si es positivo, negativo o cero: ");
                    if (Calculos.dimeSigno(num1) == 1){
                        System.out.println("Positivo");
                    } else if (Calculos.dimeSigno(num1) == -1){
                        System.out.println("Negativo");
                    } else {
                        System.out.println("Cero");
                    }
                    break;
                case 6:
                    num1 = Leer.leerEntero("Introduce la cantidad en millas: ");
                    System.out.println("La cantidad de " + num1 + " millas es de : " + Calculos.millas_a_km(num1) + " km.");
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
            }

        }while(opcion != 7);
    }

    public static void tablaMul(int num1){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }

    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static boolean esPitagoras(int num1, int num2, int num3){
        return (num1 * num1) + (num2 * num2) == (num3 * num3);
    }
}