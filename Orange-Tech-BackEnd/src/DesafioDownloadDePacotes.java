import java.util.Scanner;

public class DesafioDownloadDePacotes {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        int barras = 1;


        for (int i = barras; i <= tamanho; i++) {

            System.out.print("/");

        }

    }
}
