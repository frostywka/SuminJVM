package block3_OOP.block32DZ;

public class Dog {
    String name;
    String poroda;
    int speed;

    void run() {
        for (int i = 0; i < speed; i++)
            System.out.println("Бегу");
    }

    String info() {
        return name + "\n" + poroda + "\n" + speed;
    }
}
