package day18exception_enums;

import java.util.*;

public class ReplaceElementsIterators {
    public static void main(String[] args) {
        //6.Use a ListIterator to replace all occurrences of "X" with "Z" in the following ArrayList<String>.

        List<String> items = new ArrayList<>(Arrays.asList("X", "A", "B", "X", "C", "X"));
        System.out.println(items);
        replacement(items,"X", "Z");
        System.out.println("New String list is " +items);

    }

    public static void replacement(List<String>list , String oldValue, String newValue){
      ListIterator<String> iterator= list.listIterator();// iterators support only remove() but not set()
                                                             //ListIterators support set()

      while(iterator.hasNext()){



          if(iterator.next().equals(oldValue)){

              iterator.set(newValue);
          }
      }

    }

}
