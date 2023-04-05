import java.util.Scanner;

public class DesafioImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase;
        String array[] = new String[3];


        for (int i = 0; i < array.length; i++) {
           // System.out.print("Digite o " + (i + 1) + " o número: ");
            frase = leitor.next();
         array[i] = frase;



        }System.out.println ("Imovel: "+array[0]+" R$" +array[1]+" "+array[2]);


    }
}

//utilizando o metodo split.

//import java.util.Scanner;

//public class Program {
   // public static void main(String[] args) {
        //Scanner leitor = new Scanner(System.in);
       // String frase = leitor.next();
      //  String array[] = new String[3];
        //array = frase.split("/");
      //  String saida = "Imovel: " + array[0] + " R$" + array[1] + " " + array[2];
    //    System.out.println(saida);
  //  }
//}