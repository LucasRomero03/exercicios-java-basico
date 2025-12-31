package Examples;

import java.util.Scanner;

public class ExampleWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        var name = "";
        var name1 = "exit" ;

        //Ele avalia a condição antes de executar
        /*while (!name.equalsIgnoreCase("exit")){
            System.out.println("Digite seu nome: ");
            name = input.nextLine();
        }*/
        //Executa pelo menos uma vez e depois verifica a condição.
        do {
            System.out.println("Digite seu nome: ");
            name = input.nextLine();
        }while (!name1.equalsIgnoreCase("exit"));
    }

}
