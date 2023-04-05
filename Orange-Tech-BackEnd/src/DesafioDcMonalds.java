import java.util.Scanner;

public class DesafioDcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[4];

        listaIngredientes = ingredientes.split(";");
         String saida1 = listaIngredientes[0] ;
         String saida2 = listaIngredientes[1];
         String saida3 = listaIngredientes[2] ;
         String saida4 = listaIngredientes[3] ;
            System.out.println(saida1);
            System.out.println(saida2);
            System.out.println(saida3);
            System.out.println(saida4);


    }
}