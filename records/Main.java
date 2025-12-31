public class Main {
    public static void main(String[] args) {
       //Record
        Cliente cliente = new Cliente("Mero","gmail",23);
        //Classes
        ClienteClass clienteClass1 = new ClienteClass("Mero",10);
        ClienteClass clienteClass = new ClienteClass();
        clienteClass.setNome("Mero0");
        clienteClass.setEmail("gmail");
        clienteClass.setIdade(23);


        System.out.println(clienteClass.getNome());
        System.out.println(clienteClass.getEmail());
        System.out.println(clienteClass.getIdade());

        System.out.println(cliente.name());
        System.out.println(cliente.email());
        System.out.println(cliente.idade());
        System.out.println(cliente.getInfo());

    }
}
