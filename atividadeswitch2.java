import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        float saldo = 1000.00f;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 - Saldo, 2 - Saque, 3 - Depósito):");
        int operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.println("Saldo: R$ " + saldo);
                break;
            case 2:
                System.out.println("Operação - Saque");
                System.out.println("Digite o valor a ser sacado: R$ ");
                float saque = leia.nextFloat();
                if (saque > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.println("Novo Saldo: R$ " + saldo);
                }
                break;
            case 3:
                System.out.println("Operação - Depósito");
                System.out.println("Digite o valor a ser depositado: R$ ");
                float deposito = leia.nextFloat();
                saldo += deposito;
                System.out.println("Novo Saldo: R$ " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
        }
    }
}