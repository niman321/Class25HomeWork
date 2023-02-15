package Class25;

interface Movable {
    void move();
}
interface OwnAble{
    void own();
}
class Car implements Movable,OwnAble{

    @Override
    public void move() {
        System.out.println("move it baby");
    }

    @Override
    public void own() {
        System.out.println("own it");
    }
}
class Dog extends Car {

    @Override
    public void move() {
        System.out.println("move the car");
    }

    @Override
    public void own() {
        System.out.println("own this");
    }

    public static void main(String[] args) {
        Car move1[]={new Dog(),new Car()};
        for (int i = 0; i < move1.length; i++) {
            Car moving=move1[i];
            moving.move();
            moving.own();


        }
    }
}

