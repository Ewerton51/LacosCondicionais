package atividadesbootcamp;

import java.util.Scanner;

public class atividadecondicional3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra1, palavra2, palavra3;

        System.out.println("Entre com a palavra 1: ");
        palavra1 = leia.next();

        System.out.println("Entre com a palavra 2: ");
        palavra2 = leia.next();

        System.out.println("Entre com a palavra 3: ");
        palavra3 = leia.next();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("O animal é: Águia");
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("O animal é: Pomba");
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("O animal é: Humano");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("O animal é: Vaca");
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("O animal é: Pulga");
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("O animal é: Lagarta");
                }
            }
        }
    }
}