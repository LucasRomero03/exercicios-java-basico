package Ex1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex1_1{

public static void main(String[] args) {
    var today = OffsetDateTime.now().getYear();
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite Seu Nome: ");
    var nome = sc.nextLine();
    System.out.println("Digite o ano de seu nascimento: ");
    int ano = sc.nextInt();
    System.out.printf("Sua idade é %d:",today - ano  );
}

}