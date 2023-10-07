import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class questaoMultipla2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String question = "Quem matou o gigante Golias na Bíblia?";
        List<String> opcoesResposta = new ArrayList<>();
        opcoesResposta.add("a. Jesus");
        opcoesResposta.add("b. Davi");
        opcoesResposta.add("c. Esau");
        opcoesResposta.add("d. Paulo");
        opcoesResposta.add("e. Eva");

        String respostaCerta = "b";

        Collections.shuffle(opcoesResposta);

        System.out.println(question);

        for (String opcao : opcoesResposta) {
            System.out.println(opcao);
        }

        boolean respostaCertaEscolhida = false;

        do {
            System.out.println("Escolha a resposta correta (a, b, c, d ou e): ");
            String escolhaUsuario = input.nextLine();

            if (escolhaUsuario.equalsIgnoreCase(respostaCerta)) {
                System.out.println("Resposta correta!");
                respostaCertaEscolhida = true;
            } else {
                System.out.println("Resposta incorreta. Tente novamente.");
                Collections.shuffle(opcoesResposta);
                System.out.println(question);
            for (String opcao : opcoesResposta) {
                    System.out.println(opcao);
            }
        }
        } while (!respostaCertaEscolhida);
    input.close();
    }
}
