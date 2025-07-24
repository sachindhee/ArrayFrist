package ArraySeries;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamPart3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple1", "banana", "mango");
        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(value -> value, value -> value.length()));
        System.out.println(collect);


    }

}
