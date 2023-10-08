import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo a sua conta bancária!");

        double saldoInicial;

        do {
            System.out.println("Digite o saldo inicial da conta: ");
            while (!input.hasNextDouble()) {
                System.out.println("Valor inválido. Digite um número válido: ");
                input.next();
            }
            saldoInicial = input.nextDouble();
        } while (saldoInicial <= 0);

            double saldo = saldoInicial;

            int codigoOperacao;

            do {
                System.out.println("\nEscolha a operação: ");
                System.out.println("1- Depósito");
                System.out.println("2- Saque");
                System.out.println("3- Encerrar");
                System.out.println("Digite o código da operação: ");

                while (!input.hasNextInt()) {
                    System.out.println("Código de operação inválido. Tente novamente.");
                    input.next();
                }
                codigoOperacao = input.nextInt();

                switch (codigoOperacao) {
                    case 1:
                    double valorDeposito;
                    do {
                        System.out.println("Digite o valor do depósito: ");
                        while (!input.hasNextDouble()) {
                            System.out.println("Valor inválido. Digite um número válido: ");
                            input.next();
                        }
                        valorDeposito = input.nextDouble();
                    } while (valorDeposito <= 0);

                    saldo += valorDeposito;
                    break;

                    case 2: 
                    double valorSaque;
                    do {
                        System.out.print("Digite o valor do saque: ");
                        while (!input.hasNextDouble()) {
                            System.out.println("Valor inválido. Digite um número válido.");
                            input.next();
                        }
                        valorSaque = input.nextDouble();
                    } while (valorSaque <= 0);

                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                    } else {
                        System.out.println("Saldo insuficiente. Saque não realizado");
                    }
                    break;
                }
            } while (codigoOperacao != 3);

            System.out.println("\nOperação encerrada.");

            if (saldo == 0) {
                System.out.println("CONTA ZERADA");
            } else if (saldo < 0) {
                System.out.println("CONTA ESTOURADA");
            } else {
                System.out.println("CONTA PREFERENCIAL");
            }
            System.out.println("Saldo final da conta: R$ " + saldo);

            input.close();
    }
}