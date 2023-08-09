/**
 * 
 */
package Ejercicio_03;
/**
 * 
 */
public class ProgramaVariablesOperaciones {
	/**
	 * 
	 */
	public ProgramaVariablesOperaciones() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int X = 10;
        int Y = 5;

        double N = 7.5;
        double M = 2.0;

        System.out.println("Valor de X = " + X);
        System.out.println("Valor de Y = " + Y);
        System.out.println("Valor de N = " + N);
        System.out.println("Valor de M = " + M);

        System.out.println("X + Y = " + (X + Y));
        System.out.println("X - Y = " + (X - Y));
        System.out.println("X * Y = " + (X * Y));

        if (Y != 0) {
            System.out.println("X / Y = " + ((double) X / Y));
            System.out.println("X % Y = " + (X % Y));
        } else {
            System.out.println("No se puede dividir por 0");
        }

        System.out.println("N + M = " + (N + M));
        System.out.println("N - M = " + (N - M));
        System.out.println("N * M = " + (N * M));

        if (M != 0.0) {
            System.out.println("N / M = " + (N / M));
            System.out.println("N % M = " + (N % M));
        } else {
            System.out.println("No se puede dividir por 0");
        }

        System.out.println("X + N = " + (X + N));
        System.out.println("Y / M = " + (Y / M));
        System.out.println("Y % M = " + (Y % M));

        System.out.println("Doble de X = " + (X * 2));
        System.out.println("Doble de Y = " + (Y * 2));
        System.out.println("Doble de N = " + (N * 2));
        System.out.println("Doble de M = " + (M * 2));

        double sumaTotal = X + Y + N + M;
        double productoTotal = X * Y * N * M;

        System.out.println("Suma de todas las variables = " + sumaTotal);
        System.out.println("Producto de todas las variables = " + productoTotal);

	}

}
