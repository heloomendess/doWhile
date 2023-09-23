import java.util.Scanner;
public class jogoMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("-Menu do Jogo-");
            System.out.println("1- Instruções.");
            System.out.println("2- Jogar.");
            System.out.println("3- Créditos.");
            System.out.println("4- Sair.");
            System.out.println("Escolha uma opção: ");

            escolha = entrada.nextInt();

            switch (escolha) {
                case 1 :
                    System.out.println("1- Instruções do jogo:");
                    System.out.println("- Desenhe a base do jogo: três linhas por três colunas;");
                    System.out.println("- À vez, cada jogador coloca a sua marca onde pretender (um joga com “0”, outro jogador com “X”);");
                    System.out.println("- O objetivo do jogo é fazer uma sequência de três símbolos iguais, seja em linha vertical, horizontal ou diagonal, enquanto tenta impedir que seu adversário faça o mesmo;");
                    System.out.println("- Quando um dos participantes faz uma linha, ganha o jogo;");
                    System.out.println("- Começa do início, normalmente trocando os símbolos escolhidos.");
                break;
                case 2 :
                    System.out.println("2- Jogar");
                    System.out.println("- Iniciando o jogo...");
                break;
                case 3 :
                    System.out.println("3- Créditos");
                    System.out.println("- Criado por Heloisa Mendes");
                break;
                case 4 :
                    System.out.println("4- Sair");
                    System.out.println("Bye-bye!");
                break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                break;
            }
        } while (escolha != 4);
        entrada.close();
    }
}
