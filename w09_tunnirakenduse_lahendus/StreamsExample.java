import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.SortOrder;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*
        for (Integer i : integerList){
            System.out.println(i);
        }
        //
        System.out.println();
        //
        integerList.forEach(elem -> System.out.println(elem));
        //
        System.out.println();
        //
        integerList.forEach(System.out::print); */

        /*List<Integer> integerList2 = integerList.stream().
        filter(element -> element < 5).
        peek(System.out::print).
        collect(Collectors.toList());
        //System.out.println(integerList2);*/
        

        /*List<Integer> integerList3 = integerList.stream().
        filter(element -> element > 5).
        map(element -> element*2).
        peek(element -> System.out.print(" "+ element)).
        collect(Collectors.toList());*/


        // luua neljas list ja olgu seal elemendid, mis on paaris
       /* List<Integer> integerList4 = integerList.stream().
        filter(element -> element % 2 == 0).
        peek(element -> System.out.print(" "+ element)).
        collect(Collectors.toList()); */

        /* System.out.println(integerList.stream().count());
        System.out.println(integerList.stream().skip(4).count());*/

       /* IntStream.of(1, 2, 4, 8)
        .map(e -> e * e)
        .filter(e -> e < 50)
        .forEach(e -> System.out.print(e + " " ));*/

        // IntStream.iterate(1, i -> i * 2).limit(10).forEach(System.out::println);

       /* IntStream.range(1, 10)
        .filter(e -> e % 2 == 0)
        .forEach(System.out::print);*/

       /* IntStream.rangeClosed(5, 100)
        .filter(e -> e % 5 == 0)
        .forEach(e -> System.out.print(e + " " )); */

        // System.out.println(IntStream.of(2,4,6,8,10).allMatch(e -> e % 2 == 0));
        // System.out.println(IntStream.of(2,4,5,6,8,10).anyMatch(e -> e % 2 != 0));
        
       /* int[] newArray = new int[] {1, 2, 3};

        Arrays.stream(new int[] {1, 2, 3})
          .map(e -> e * e)
          .average()
          .ifPresent(System.out::println);*/

        // IntStream.of(1,2,3,4).filter(e -> e < 10).min().ifPresent(System.out::println);

        // teine list numbrites ja leida max väärtus
        IntStream.of(1,2,3,4).filter(e -> e < 10).max().ifPresent(System.out::println);
        //System.out.println(IntStream.of(1,3,5,8).sum(e -> e < 2);
        IntStream.of(3,2,1,4).filter(e -> e < 10).findFirst().ifPresent(System.out::println);
    }
}
