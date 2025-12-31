package Ex1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base do retangulo:");
        var base = scan.nextInt();
        System.out.println("Digite a lado do retangulo:");
        var lado = scan.nextInt();
        System.out.println("A aréa do seu retangulo é:  "+base*lado);
    }
}
