import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int j = 10;

        do {
            System.out.println(i + "é menor que" + j);
            i++;
        } while (i < j);

    }
}

