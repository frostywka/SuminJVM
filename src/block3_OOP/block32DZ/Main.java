package block3_OOP.block32DZ;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Bobby";
        dog.poroda = "Kolly";
        dog.speed = 10;

        dog.run(); // VOID

        String info1 = dog.info();
        System.out.println(info1);
    }
}
