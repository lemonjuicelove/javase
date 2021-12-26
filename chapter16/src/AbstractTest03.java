public class AbstractTest03 {
    public static void main(String[] args) {

        Car c1 = new Bus();
        Car c2 = new Bus("三路汽车");
        System.out.println(c1.name);
        System.out.println(c2.name);
        c1.move();

    }
}

abstract class Car{

    String name;

    public Car(){}
    public Car(String name) {
        this.name = name;
    }
    public abstract void move();

}

class Bus extends Car{

    public Bus(){
    }
    public Bus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("bus is moving");
    }

}