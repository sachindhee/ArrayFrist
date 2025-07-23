package ArraySeries;
class Gen<T>
{
    T ob;

    Gen(T o)
    {
        ob = o;
    }

    T Getob()
    {
        return ob;

    }


    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
}
public class GericDemo {

    public static void main(String [] args)
    {
        Gen<Integer> onj;
        onj = new Gen<>(100);
       System.out.println(onj.Getob());
    }
}
