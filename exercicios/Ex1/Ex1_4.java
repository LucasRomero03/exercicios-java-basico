package Ex1;

import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        var  idade1 = input.nextInt();
        System.out.println("Digite a idade de outra pessoa:");
        var  idade2 = input.nextInt();
        System.out.println("A Diferença entre as idade é de : "+(Math.abs(idade1-idade2))+ " anos" );
        System.out.printf("A Diferença entre as idades é de: %s", Math.abs(idade1-idade2));

    }
}
