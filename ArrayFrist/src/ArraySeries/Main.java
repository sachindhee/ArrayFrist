package ArraySeries;// Online Java Compiler
// Use this editor to write, compile and run your Java code online


interface Machine {
    default void speed()
     {
         System.out.println("hello");
     }

}
class Car  implements Machine
{

}


class Main {
    public static void main(String[] args) {


        Car car = new Car();
        car.speed();






    }
}