import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inicio: ");
        int inicio = input.nextInt();
        System.out.println("Fim: ");
        int fim = input.nextInt();

        while (inicio <= fim) {
            if (inicio %2 == 0)
                System.out.println("par = " + inicio);
                inicio++;

        }

        while (inicio >= fim) {
            if (fim %2 == 1)
                System.out.println("impar= " + fim);
                fim++;
        }
        System.out.println("Fora do while.");
        input.close();
    }
}
