import java.util.Scanner;

public class questaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tentativas = 0;
        boolean respostaCerta = false;

        do {
            System.out.println("Questão 1: J.R.R Tolkien é escritor de qual livro?");
            System.out.println("a) Harry Potter.");
            System.out.println("b) O Senhor dos Anéis.");
            System.out.println("c) Star Wars.");
            System.out.println("d) Jogos Vorazes.");
            System.out.println("Escolha uma das opções: ");

            char resposta = entrada.next().charAt(0);

                switch (resposta) {
                    case 'B':
                    case 'b':
                    System.out.println("Resposta correta na " + (tentativas + 1) 
                    
                    + " tentativa.");
                    respostaCerta = true;
                    break;
                    default: 
                    System.out.println("Resposta incorreta! Tente novamente.");
                    tentativas++;
                }

                if (tentativas == 3 && respostaCerta) {
                    System.out.println("Resposta incorreta nas 3 tentativas.");
                    break;
                }               
        } while (!respostaCerta && tentativas < 3);

                entrada.close();
    }
}
