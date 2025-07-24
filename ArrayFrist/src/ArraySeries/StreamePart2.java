package ArraySeries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamePart2 {

    public static void main(String [] args)
    {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 3, 2, 5, 2, 4);
        List<Integer> collect = list.stream().
                filter(x -> x % 2 == 0)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);


        List<String> list1 = Arrays.asList("ram,shayam,karan");
        List<String> collect1 = list1.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect1);



    }
}
