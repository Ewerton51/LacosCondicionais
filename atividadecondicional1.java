package atividadesbootcamp;

import java.util.Scanner;

public class atividadecondicional1 {

	public static void main(String[] args) {
		
		float v1,v2,v3,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
		v1 = leia.nextFloat();
		System.out.println("\nDigite o número B: ");
		v2 = leia.nextFloat();
		System.out.println("\nDigite o número C: ");
		v3 = leia.nextFloat();
		
		total = (v1+v2);
		
		if (total > v3) {
			System.out.println("\nA soma de "+v1+ " e " +v2+ " é maior que "+v3);
		}if(total < v3){
			System.out.println("\nA soma de "+v1+ " e " +v2+ " é menor que "+v3);
		}if (total == v3) {
			System.out.println("\nA soma de "+v1+ " e " +v2+ " é igual a "+v3);
		}
		
	}

}
