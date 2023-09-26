import java.util.Scanner;

public class seisValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;
        float soma = 0.0f;
        int positivo = 0;

        System.out.println("Digite 6 valores: ");

        while (contador < 6) {
            double valor = input.nextDouble();
             
            if (valor > 0) {
                soma += valor;
                positivo++;
            }
            contador++;
        }
        input.close();

        if (positivo > 0) {
            double media = soma / positivo;
            System.out.println("1) Soma dos valores positivos: " + soma);
            System.out.println("2) Quantidade de valores positivos: " + positivo);
            System.out.println("3) Média dos valores positivos: " + media);
        } else {
            System.out.println("Nenhum valor digitado.");
        }
    }
}
