package Ejercicio_01;
public class OperacionesNumericas {
	public OperacionesNumericas() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	int num1 = 10;
        int num2 = 5;
        
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
        
        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
        
        int multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División por cero no permitida.");
        }
        
        int modulo = num1 % num2;
        System.out.println("Módulo: " + modulo);
	}
}