package Ex3_3;

/*
* Dar banho no pet;
Abastecer com água;
Abastecer com shampoo;
verificar nivel de água; ok
verificar nivel de shampoo; ok
verificar se tem pet no banho;
colocar pet na maquina;
retirar pet da máquina;
limpar maquina.
* */

public class WashMachine {

    private int shampoo = 10;
    private int agua = 30;
    private Pet pet;
    private Boolean isClean = true;

    public void washPet(){

        if(!temPet()){
            System.out.println("primeiro coloque um pet na maquina");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        this.pet.setClean(true);
    }
    public void abastecerAgua(){
        if(this.agua >= 30){
          System.out.println("Limite de agua atingido");
          return;
        }
        this.agua += 2;
    }

    public void abastecerShampoo(){
        if(this.shampoo >= 10){
          System.out.println("Limite de Shampoo atingido");
          return;
        }
        this.shampoo += 2;
    }
    public Boolean temPet(){

        if (this.pet == null){
            return false;
        }
        return true;
    }
    public void colocarPet(Pet pet){
        if(!isClean){
            System.out.println("máquina está suja, lave-a antes de usar");
            return;
        }
        if(temPet()){
            System.out.println("Já possui PET na máquina");
            return;
        }
        this.pet = pet;
    }
    public void tirarPet(){
        if(!temPet()){
            System.out.println("não possui pet ainda na máquina");
        }
        if (!pet.isClean()){
            this.isClean = false;
        }
        this.pet = null;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getAgua() {
        return agua;
    }

    public void limparMaquina(){
        System.out.println("Limpando maquina");
        this.isClean = true;
        this.agua -= 3;
        this.shampoo -= 1;
    }
}
