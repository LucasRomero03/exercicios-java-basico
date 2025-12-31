package Ex2;

import java.util.Scanner;

public class Ex2_4 {
    /*
    * Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
    *  a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0
    *  na divisão, números menores que o primeiro número devem ser ignorados
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiro = input.nextInt();

        while(true){
            System.out.println("Digite o segundo numero: ");
            int segundo = input.nextInt();
            if(segundo<primeiro){
                System.out.println("um numero maior que o primeiro: ");
            }else{
                if (segundo % primeiro != 0){
                    break;
                }

            }

        }
    }
}
