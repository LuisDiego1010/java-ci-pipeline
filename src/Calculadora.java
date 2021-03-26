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
        double conversion=1/a;
        resultado = (float) Math.pow(b,conversion);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        Calculadora cal = new Calculadora();
        boolean loop=true;
        System.out.println("--------Menú Calculadora Simple--------");
        System.out.println(" 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. División\n 5. Raiz enésima de un número\n 6. Salir\n");
        while (loop){
            int a;
            int b;
            int opcion;
            System.out.println("Ingrese la opción que corresponde a la operación que desea realizar: ");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer valor que desea sumar:" );
                    a=leer.nextInt();
                    System.out.println("Ingrese el segundo valor que desea sumar:" );
                    b=leer.nextInt();
                    System.out.println("El resultado de la suma es: " + cal.suma(a,b) + "\n");
                    break;
                case 2:
                    System.out.println("Ingrese el primer valor que desea restar:" );
                    a=leer.nextInt();
                    System.out.println("Ingrese el segundo valor que desea restar:" );
                    b=leer.nextInt();
                    System.out.println("El resultado de la resta es: " + cal.resta(a,b) + "\n");
                    break;
                case 3:
                    System.out.println("Ingrese el primer valor que desea multiplicar:" );
                    a=leer.nextInt();
                    System.out.println("Ingrese el segundo valor que desea multiplicar:" );
                    b=leer.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + cal.multiplicacion(a,b) + "\n");
                    break;
                case 4:
                    System.out.println("Ingrese el primer valor que desea dividir:" );
                    a=leer.nextInt();
                    System.out.println("Ingrese el segundo valor que desea dividir:" );
                    b=leer.nextInt();
                    System.out.println("El resultado de la división es: " + cal.division(a,b) + "\n");
                    break;
                case 5:
                    System.out.println("Ingrese la raiz que desea calcular:" );
                    a=leer.nextInt();
                    System.out.println("Ingrese el numero al que desea calcular la raiz ingresada anteriormente:" );
                    b=leer.nextInt();
                    System.out.println("El resultado de la suma es: " + cal.raiz(a,b) + "\n");
                    break;
                case 6:
                    System.out.println("¡Gracias por usar la calculadora básica!");
                    loop=false;
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta, favor ingrese una opcion correcta \n");
            }
        }
    }
}