import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Como utilizar o Debug no Eclipse (execu��o passo a passo)
		 * 
		 * � Para marcar uma linha de breakpoint: � Run -> Toggle Breakpoint � Para
		 * iniciar o debug: � Bot�o direito na classe -> Debug as -> Java Application �
		 * Para executar uma linha: � F6
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();

	}

}
