package ListDemo;



public class ListEntity {

    private int  id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public ListEntity(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String toString()
//    {
//        return "ListEntity{"+"id="+id+" ,name="+name+", age="+age+"'}'";
//    }





}
