import java.util.Scanner;

public class DesafioPontosNaCarteira {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();


        if (velocidade > 80) {
            multas = multas + 1;
            if (multas >= 3) {
                System.out.println(multas + " multas. Levou pontos na carteira");

            }else {
                System.out.println(multas + " multas. Nao levou pontos na carteira");
            }
        }
        if (velocidade <= 80 && multas >= 3) {
            System.out.println(multas + " multas. Levou pontos na carteira");

        }
        if (velocidade <= 80 && multas < 3) {
            System.out.println(multas + " multas. Nao levou pontos na carteira");

        }
    }

    }



