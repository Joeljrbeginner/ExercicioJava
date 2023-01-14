package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionalProdutoParouImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int codigo,quantidade;
		double valor_total;
		{
		System.out.println("\n=========MENU DE PRODUTOS=========");
		System.out.println("\nCÓD/ PRODUTOS");
		System.out.println("\n1- Cachorro-quente R$ 10.00.");
		System.out.println("\n2- X-salada R$ 15.00.");
		System.out.println("\n3- X-bacon R$ 18.00.");
		System.out.println("\n4- Bauru R$ 12.00.");
		System.out.println("\n5- Refrigerante R$8.00.");
		System.out.println("\n6- Suco de laranja R$ 13.00.");
		System.out.println("\n==================================");
		System.out.println("\nDigite o código do produto:  ");
		codigo = ler.nextInt();
		System.out.println("\nColoque a quantidade de produtos: ");
		quantidade = ler.nextInt();
		
		switch(codigo){
		case 1:
			valor_total = ((double) quantidade * 10.00);
			System.out.println("\nVocê comprou " +quantidade+ " Cachorro-quente e vai pagar R$ " +valor_total);
			break;
		case 2:
			valor_total = ((double) quantidade * 15.00);
			System.out.println("\nVocê comprou " +quantidade+ " X-salada e vai pagar R$ " +valor_total);
			break;
		case 3:
			valor_total = ((double) quantidade * 18.00);
			System.out.println("\nVocê comprou " +quantidade+ " X-bacon e vai pagar R$ " +valor_total);
			break;
		case 4:
			valor_total = ((double) quantidade * 12.00);
			System.out.println("\nVocê comprou " +quantidade+ " Bauru e vai pagar R$ " +valor_total);
			break;
		case 5:
			valor_total = ((double) quantidade * 8.00);
			System.out.println("\nVocê comprou " +quantidade+ " Refrigerante e vai pagar R$ " +valor_total);
			break;
		case 6:
			valor_total = ((double) quantidade * 13.00);
			System.out.println("\nVocê comprou " +quantidade+ " Suco de laranja e vai pagar R$ " +valor_total);
			break;
			default: 
				System.out.println("\nOpção inválida!!!");

	
	}

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
}






	


