package Examples;

import java.util.Scanner;

public class ExampleSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var option = sc.nextInt();
        var mensagem =
                switch (option) {
                    case 1,4 ->{ // se tiver mais de uma linha no bloco especificar usando o yield o retorno
                        var dia = option== 1 ?"quadrado":"retangulo";
                        yield String.format("Possui quatro lados, mas é um %s",dia);
                    }
                    case 2 -> "Circulo";
                    case 3 -> "Circulo";
                    default -> "opção invalida";
                };
        System.out.println(mensagem);

        /*
        * maneira padrão que conheço do switch
            switch(option){
                case 1: System.out.println(option);
                break;
                case 2: System.out.println(option);
                break;
                case 3: System.out.println(option);
                break;
            }
        * */

    }
}
