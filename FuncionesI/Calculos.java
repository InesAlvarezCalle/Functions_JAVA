package FuncionesI;

public class Calculos {
    public static int queDescuento(double num1, double num2){
        if (num1 == 0) return 0;
        return (int)(((num1 - num2) * 100 )/ num1);
    }

    public static int dimeSigno(int num1){
        if (num1 > 0){
            return 1;
        } else if (num1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static double millas_a_km(int num1){
        return num1 * 1.60934;
    }
}
