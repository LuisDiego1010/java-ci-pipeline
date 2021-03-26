import java.util.*;
public class Calculadora {
    float resultado;

    public float suma(float a, float b) {
        resultado = a + b;
        return resultado;
    }
    public float resta(float a, float b) {
        resultado = a - b;
        return resultado;
    }
    public float multiplicacion(float a, float b) {
        resultado = a * b;
        return resultado;
    }
    public float division(float a, float b) {
        resultado = a / b;
        return resultado;
    }
    public float raiz(float a, double b) {
        double conversion=1/b;
        resultado = (float) Math.pow(a,conversion);
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        System.out.println(cal.suma(3, 6));
        System.out.println(cal.raiz(20, 3));

    }
}