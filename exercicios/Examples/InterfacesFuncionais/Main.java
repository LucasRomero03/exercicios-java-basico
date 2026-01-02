package Examples.InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args){
    List<User> users = List.of( new User("mero",13),
            new User("isa",13),
            new User("show",23));

    List<Client> clientes = List.of(new Client("null","me","123"));


     var consumer = new Consumer<User>(){

         @Override
         public void accept(User user) {
            System.out.println(user);
         }
     };

     var copyToDto = new BiConsumer<User,Client>(){

         @Override
         public void accept(User user, Client client) {
                  client.setName(user.getName());
         }
     };

     var copyToDto2 = new Function<User,UserDto>(){
         @Override
         public UserDto apply(User user) {

             return new UserDto(user.getName(),user.getAge());
         }
     };
     //metod reference
    Supplier<String> name = users.get(0)::getName;
    System.out.println(name.get());
    //
     UserDto user1 = copyToDto2.apply(users.get(1));
     System.out.println(user1.toString());
     //antes
    System.out.println(clientes.get(0).getName());
    //passando pelo biconsumer
    copyToDto.accept(users.get(0),clientes.get(0));
    //depois do biconsumer
    System.out.println(clientes.get(0).getName());

    //users.forEach(consumer);

    //lambdas
     users.forEach(user -> {
         user.setAge(user.getAge() + 1);

     });

    //lambdas
     users.forEach(user -> {
         System.out.println(user.getName());
         System.out.println(user.getAge());
         ;});



    }





}
