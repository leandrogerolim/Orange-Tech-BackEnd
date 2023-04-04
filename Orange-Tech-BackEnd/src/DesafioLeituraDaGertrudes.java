import java.util.Scanner;

public class DesafioLeituraDaGertrudes {


        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int paginas = leitor.nextInt();
            int paginasLidas = 3;

            int total =   paginas / paginasLidas;

            System.out.println(total + " dias");

            // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

        }
    }

