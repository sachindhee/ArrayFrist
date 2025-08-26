package ListDemo;


import java.util.ArrayList;
import java.util.List;

public class DemoList {



    public static void main(String [] args)
    {


       ListEntity listEntity = new ListEntity(1,"sacin",12);

      List<ListEntity> list = new ArrayList<>();
      list.add(listEntity);
      System.out.print(list);

for (ListEntity listEntity1 : list){
    System.out.println(listEntity1);
}



    }

}
