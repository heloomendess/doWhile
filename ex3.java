import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("- Calculadora Simples -");
            System.out.println("===================");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("===================");
            System.out.println("Escolha uma operação: ");
            op = input.nextInt();
        } while (op < 1 || op > 4);

            System.out.println("Número 1: ");
            double n1 = input.nextDouble();
            System.out.println("Número 2: ");
            double n2 = input.nextDouble();

            double result = 0;
            switch (op) {
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    result = n1 / n2;
                    break;
            }
            System.out.println("Resultado: " + result);
            input.close();
    }
}
