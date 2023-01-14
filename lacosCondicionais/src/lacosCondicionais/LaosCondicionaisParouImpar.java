package lacosCondicionais;

import java.util.Scanner;

public class LaosCondicionaisParouImpar {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("\nO número: " +numero+ " é par");
		}
		else {
			System.out.println("\nO número: " +numero+ " é ímpar");
		}

	}



	}


