package atividadesbootcamp;

import java.util.Scanner;

public class atividadecondicional2 {

    public static void main(String[] args) {
        String nome;
        int idade;
        boolean primeiraDoacao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o Nome do doador:");
        nome = leia.nextLine();

        System.out.println("Digite a Idade do doador:");
        idade = leia.nextInt();

        System.out.println("Primeira doação de sangue? (true/false):");
        primeiraDoacao = leia.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && primeiraDoacao) {
                System.out.println(nome + " não está apto para doar sangue!");
            } else {
                System.out.println(nome + " está apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " não está apto para doar sangue devido à idade.");
        }
    }
}