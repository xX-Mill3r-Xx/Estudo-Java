import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Estrutura Repetitiva While
		 * 
		 * � uma estrutura de controle que
			repete um bloco de comandos enquanto uma condi��o for verdadeira.
			Quando usar: quando n�o se sabe previamente a quantidade de repeti��es que ser� realizada.
		 * */
		
		/*Problema exemplo:
			Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao
			final mostra a soma dos n�meros lidos.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor: ");
		int x = sc.nextInt();
		int sum = 0;
		while(x != 0) {
			sum += x;
			System.out.print("Entre com o valor: ");
			x = sc.nextInt();
		}
		
		System.out.println("Programa finalizado, voce digitou o valor 0!");
		System.out.println("Soma dos valores digitados: " + sum);
		sc.close();

	}

}
