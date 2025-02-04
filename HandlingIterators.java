package day18exception_enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HandlingIterators {
    public static void main(String[] args) {
      // 10. Modify the given code to avoid ConcurrentModificationException when removing elements from a list.
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Jerry", "Spike", "Butch"));

        /*for (String name : names) {
            if (name.startsWith("S")) {
                names.remove(name);
            }
        }

        System.out.println(names);
    }
}*/
        Iterator<String> name= names.iterator();
        while(name.hasNext()) {

            if (name.next().startsWith("S")) {
                name.remove();
            }
        }
        System.out.println(names);
            }
        }




