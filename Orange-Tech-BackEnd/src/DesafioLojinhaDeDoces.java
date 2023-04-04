import java.util.Scanner;

public class DesafioLojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int doce = 2;

        int total = doce * dinheiro;

        System.out.println("O cliente obteve " + total + " doces");

    }
}
