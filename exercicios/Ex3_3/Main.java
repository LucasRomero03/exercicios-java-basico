package Ex3_3;

import java.util.Scanner;

public class Main {
    private final static WashMachine machine = new WashMachine();
    private final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = -1;
        do {
            System.out.println("Escolha uma das opções");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer agua");
            System.out.println("3- abastecer shampoo");
            System.out.println("4- verificar agua");
            System.out.println("5- verificar shampoo");
            System.out.println("6- colocar pet na maquina");
            System.out.println("7- tirar pet da maquina");
            System.out.println("8- ver se tem pet tomando banho");
            System.out.println("9- limpar maquina");
            System.out.println("0- sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> machine.washPet();
                case 2 -> machine.abastecerAgua();
                case 3 -> machine.abastecerShampoo();
                case 4 -> System.out.println(machine.getAgua());
                case 5 -> System.out.println(machine.getShampoo());
                case 6 -> colocarPetNaMaquina();
                case 7 -> machine.tirarPet();
                case 8 -> System.out.println(machine.temPet());
                case 9 -> machine.limparMaquina();
            }
        }while (opcao != 0);
    }

    public static void colocarPetNaMaquina(){
        System.out.println("Escolha o nome do pet");
        var nome = "";
        while(nome.isEmpty()|| nome == null) {
            nome = input.next();
        }
        var pet = new Pet(nome);
        machine.colocarPet(pet);

    }
}



