/**
 * 
 */
package Ejercicio_02;
/**
 * 
 */
public class ProgramaVariables {
	/**
	 * 
	 */
	public ProgramaVariables() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N = 5;
        double A = 4.56;
        char C = 'a';

        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);

        double suma = N + A;
        System.out.println(N + " + " + A + " = " + suma);

        double diferencia = A - N;
        System.out.println(A + " - " + N + " = " + diferencia);

        int valorNumericoC = (int) C;
        System.out.println("Valor numérico del carácter " + C + " = " + valorNumericoC);

	}

}
