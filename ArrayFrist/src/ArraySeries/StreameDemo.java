package ArraySeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreameDemo {


    public static void main(String [] args)
    {

//        List<Integer> list = Arrays.asList(1,3,5,6,3,2,5,3,2,5,6,4);
//        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).sorted().distinct().sorted((a,b) -> (b-a)).collect(Collectors.toList());
//        System.out.println(collect);

        int arr[] = {1,3,4,23,3,4,5,6};

        List<Integer> collect = Arrays.stream(arr).boxed().map(x->x).limit(100).distinct().collect(Collectors.toList());
        System.out.println(collect);
        int i =0;


    }
}
