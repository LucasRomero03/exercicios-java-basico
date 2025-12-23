import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleFor {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        //For normal
        /*for(int i = 1; i < 10; i++){
            //if(i %2 ==0) { podemos usar essas keywords para alterar ai o funcioaneto do If
            //   break;
            //   continue;
            //}

            System.out.println(i);
        }*/
        //For each
        for (var arg : lista) {
            System.out.printf("valor - %s \n",arg);
        }
    }

}
