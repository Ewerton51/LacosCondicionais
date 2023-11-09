package atividadesbootcamp;

import java.util.Scanner;

public class atividadeswitch1 {

	public static void main(String[] args) {
		
		int menu;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\tMenu de lanches e bebidas");
		System.out.println("1- Cachorro quente");
		System.out.println("2- X-Salada");
		System.out.println("3- X-Bacon");
		System.out.println("4- X-Bacon");
		System.out.println("5- Bauru");
		System.out.println("6- Refrigerante");
		System.out.println("7- Suco de laranja");
		
		System.out.println("\nEscolha um item no menu (1 a 6): ");
		
		menu = leia.nextInt();
		
		int quantidade;
		double precoUnitario = 0.0;
		
		switch (menu) {
        case 1:
            System.out.println("Você escolheu: Cachorro Quente");
            precoUnitario = 10.00;
            break;
        case 2:
            System.out.println("Você escolheu: X-Salada");
            precoUnitario = 15.00;
            break;
        case 3:
            System.out.println("Você escolheu: X-Bacon");
            precoUnitario = 18.00;
            break;
        case 4:
            System.out.println("Você escolheu: Bauru");
            precoUnitario = 12.00;
            break;
        case 5:
            System.out.println("Você escolheu: Refrigerante");
            precoUnitario = 8.00;
            break;
        case 6:
            System.out.println("Você escolheu: Suco de Laranja");
            precoUnitario = 13.00;
            break;
        default:
            System.out.println("Opção inválida. Escolha um item de 1 a 6.");
            return;
    }
		System.out.print("Quantidade: ");
        quantidade = leia.nextInt();
        
        double valorTotal = quantidade * precoUnitario;
		System.out.println("Valor total: R$ "+valorTotal);
		
        
	}

}
