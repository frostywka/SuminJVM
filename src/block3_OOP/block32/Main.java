package block3_OOP.block32;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.length = 5;
        box1.height = 5;
        box1.width = 5;

        box2.length = 10;
        box2.height = 10;
        box2.width = 10;

        box1.showVolume();  // VOID
        box2.showVolume();

        double vol1 = box1.volume1(); // Return
        double vol2 = box2.volume1();

        System.out.println(vol1);
        System.out.println(vol2);
    }
}
