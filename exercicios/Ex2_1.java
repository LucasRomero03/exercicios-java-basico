import java.util.Scanner;

/*Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;*/

public class Ex2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para fazer a tabuada: ");
        var n =  sc.nextInt();

        for(int i = 1; i <= n; i++ ){
           System.out.printf("%d x %d = %d \n",n,i,i*n);
        }

    }
}
