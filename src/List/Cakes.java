package List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronald on 20/11/16.
 */
public class Cakes {
    public static void main(String[] args) {


        String[] partycakes = {"smurf ", "lorry ", "ninja"};

        List<String> funcakes = new ArrayList<>();
              for (String x : partycakes)
            funcakes.add(x);

        /*
        U can either use the iterator or any other loop.
        for (Iterator<String> it = funcakes.iterator(); it.hasNext(); ) {
            String obj = it.next();
            System.out.printf("%s", obj);
        */
        for (int i = 0; i < funcakes.size(); i++) {
            System.out.printf("%s", funcakes.get(i));

        }

    }
}
