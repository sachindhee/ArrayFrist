package ArraySeries;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListDemo {
    public static void main(String [] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//       for (int i=0;i<list.size();i++)
//       {
//           System.out.println(list.get(i));
//       }

//        System.out.println(list.contains(6));

//        list.remove(5);
//        System.out.println(list);

//        list.add(2,55);

//        list.set(1,43);

//        System.out.println(list);
//
//        ArrayList<Integer> list1 = new ArrayList<>(11);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);

        List<String> list1 = Arrays.asList("apple", "banana", "date");
        System.out.println(list1);


    }
}
