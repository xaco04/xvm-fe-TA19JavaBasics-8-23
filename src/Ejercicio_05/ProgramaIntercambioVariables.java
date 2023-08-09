/**
 * 
 */
package Ejercicio_05;

/**
 * 
 */
public class ProgramaIntercambioVariables {

	/**
	 * 
	 */
	public ProgramaIntercambioVariables() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        int temp = B;
        B = C;
        C = A;
        A = D;
        D = temp;

        System.out.println("Valor de A = " + A);
        System.out.println("Valor de B = " + B);
        System.out.println("Valor de C = " + C);
        System.out.println("Valor de D = " + D);
	}
}
