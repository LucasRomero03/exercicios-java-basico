import java.util.Scanner;

public class Ex1_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        int lado = sc.nextInt();
        System.out.printf("A aréa do quadrado é: %s",lado * lado);
    }
}
