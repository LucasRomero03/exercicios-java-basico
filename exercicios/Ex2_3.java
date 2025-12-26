import java.util.Scanner;


/*
* Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e
*  escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares
* (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
* */

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.println("Impar ou par: ");
        var paridade = input.next();

        for (int i=n1; i<=n2; i++) {
            if(i%2==0 && paridade.equalsIgnoreCase("par")) {
                System.out.println(i);
            }else if(i%2==1 && paridade.equalsIgnoreCase("impar")) {
                System.out.println(i);
            }else{
                continue;
            }
        }


    }
}
