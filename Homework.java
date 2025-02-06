package day20lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Homework {
    public static void main(String[] args) {
        //5.Write the code that calculates the factorial of the given number.

        Function<Integer,Integer>factorial=t->{
            int result=1;
            for(int i=1;i<=t;i++){
                result*=i;

            }

            return result;
        };
        int number= factorial.apply(5);
        System.out.println("Factorial = " +number);


        List<String> list = new ArrayList<>();
        list.add("George");
        list.add("Michael");
        list.add("Jill");
        list.add("Tom");
        list.add("Emily");
        list.add("Karl");
        list.add("Lia");
        list.add("Lia");
        list.add("Zaaf");
printAllUniqueElementsLessthanFiveCharacters(list);
        System.out.println("------------------");

printAllUniqueWithLessThanFiveCharactersToLowercase(list);
        System.out.println("---------");
        deleteElementsStartsWithZOrEndsWithF(list);
        System.out.println(list);

       int sum= getSumOfIntegers(2,8);
        System.out.println("Sum = " +sum);

    }
//1. Write a method that prints all unique (non-repetitive) elements
//with less than 5 characters in a List<String> to the console.

    public static void printAllUniqueElementsLessthanFiveCharacters(List<String>list){

        list.stream().distinct().filter(t->t.length()<5).forEach(System.out::println);

    }
    //2.Write a method that converts all unique elements with less than 5 characters
    //in a List<String> to lowercase letters and prints them to the console according to their natural order.


    public static void printAllUniqueWithLessThanFiveCharactersToLowercase(List<String>list){


        list.stream().distinct().filter(t->t.length()<5).map(t->t.toLowerCase()).sorted().forEach(System.out::println);
    }

    //3.Create a method that deletes elements that start with 'Z' or ends with 'f'.
            public static void deleteElementsStartsWithZOrEndsWithF(List<String>list){

        list.removeIf(t->t.startsWith("Z")||t.endsWith("f"));


            }

            //4.In Lambda06, make getSumOfIntegers() dynamic,
    //(make it possible to pass values to the method for range)
            public static int getSumOfIntegers(int a, int b){

    /*
            .range(7, 70) - 7 is, but 70 isn't included
            .rangeClosed(7, 70) - 7 and 70 are included

     */

                // If you want to work on several integer values, we have IntStream
                return IntStream
                        .rangeClosed(a, b)
                        .reduce(Math::addExact) // Returns Optional
                        .getAsInt(); // Integer
                //.reduce(Integer::sum)
                //.reduce(0, (a, b) -> a + b);

            }



    }





