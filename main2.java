package ejercicio3_divisas;

import java.util.Scanner;

/**
 * 
 */
public class UsoDivisa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la cantidad dasdasasde dinero: ");
		double valor = Double.parseDouble(teclado.nextLine());


		System.out.println("Introduce el tipo de moneda: ");
		char tipoMoneda = teclado.nextLine().charAt(0);

		Divisa mDivisa = new Divisa(valor, tipoMoneda);

		mDivisa.dimeNombreMoneda();

		teclado.close();
	}

}
