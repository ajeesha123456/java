package day18exception_enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumberFilterIterator {
    public static void main(String[] args) {
        //5.Write a Java program that uses an Iterator to remove all numbers less than 50 from an ArrayList<Integer>.

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 45, 60, 32, 80, 99));
        Iterator<Integer> itr=numbers.iterator();
        while(itr.hasNext()) {

            if (itr.next() < 50) {
                itr.remove();

            }
        }
            System.out.println(numbers);





    }
}
