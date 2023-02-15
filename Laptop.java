package Class25;

interface Washable{
    void wash();
}
class SmartWatch implements Washable{

    @Override
    public void wash() {
        System.out.println(" wash wash wash");
    }
}
public class Laptop extends SmartWatch {
    @Override
    public void wash() {
        System.out.println("you can wash this watch");
    }
}
class Phone extends Laptop {
     public void wash(){
        System.out.println("you can wash");
    }
}
class Inverter extends Phone{
     public void wash(){
        System.out.println("wash me");
    }

    public static void main(String[] args) {
        Washable []arr={new SmartWatch(),new Laptop(),new Phone(),new Inverter()};
        for (int i = 0; i < arr.length; i++) {
            Washable washing=arr[i];
            washing.wash();
            Washable w=new Inverter();
            w.wash();

        }
    }
}
