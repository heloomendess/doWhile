import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0, soma=0, x;

        while(i < 10) {
            System.out.println("Digite o item " + i);
            x = input.nextInt();
            if (x < 0) {
                System.out.println("Número inválido!");
            break;
            }
            soma+=x;
            i+=1;
        }
        System.out.println("Total: " + soma);
    }
}
