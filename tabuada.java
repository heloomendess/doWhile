import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.println("Digite um valor entre 2 e 1000: ");
            n = input.nextInt();
        } while (n < 2 || n > 1000);

        input.close();

        int x = 1;
        System.out.println("Tabuada do número: " + n);
        do {
            int resultado = x * n;
            System.out.println(x + " x " + n + " = " + resultado);
            x++;
        } while (x <= 10);
    }
}
