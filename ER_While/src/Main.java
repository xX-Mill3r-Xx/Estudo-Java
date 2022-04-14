import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Estrutura Repetitiva While
		 * 
		 * É uma estrutura de controle que
			repete um bloco de comandos enquanto uma condição for verdadeira.
			Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.
		 * */
		
		/*Problema exemplo:
			Fazer um programa que lê números inteiros até que um zero seja lido. Ao
			final mostra a soma dos números lidos.*/
		
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
