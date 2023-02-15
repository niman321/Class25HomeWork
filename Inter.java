package Class25;

interface Nima{
    void speak();
    void walk();
    void practice();
}
interface milda extends Nima{
    void goodKisser();
    void goodLover();
}
class Result implements Nima,milda{

    @Override
    public void speak() {
        System.out.println("nima can speak");
    }

    @Override
    public void walk() {
        System.out.println("nima can walk ");
    }

    @Override
    public void practice() {
        System.out.println("nima practices");
    }

    @Override
    public void goodKisser() {
        System.out.println("best kisser woww");
    }

    @Override
    public void goodLover() {
        System.out.println("best lover wowww");
    }
}

public class Inter extends Result {
    public void speak() {
        System.out.println("nima can speak woww");
    }

    @Override
    public void walk() {
        System.out.println("nima can walk woww");
    }

    @Override
    public void practice() {
        System.out.println("nima practices wowww");
    }

    @Override
    public void goodKisser() {
        System.out.println("best kisser woww");
    }

    @Override
    public void goodLover() {
        System.out.println("best lover wwwoww");
    }

}
