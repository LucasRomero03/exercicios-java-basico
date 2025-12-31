//uma classe imutavél
//sempre criar os atributos privados privado
//não permite atributos no corpo
//Só para leitura, não permite set
// entrou no java 17 lts

public record Cliente(String name, String email, int idade ) {

    //compact constructor
    //para validações ?
    public Cliente{
        System.out.println("Roda antes da de executar de fato o código");
        System.out.println("NOME "+ name);

    }

    //PERMITE MÉTODOS
    public String getInfo(){
      return "nome "+ name + ", idade "+ idade + "email" + email;

    }

}
