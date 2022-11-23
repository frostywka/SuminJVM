package block3_OOP.block31;

public class Main {
    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.length = 10;
        myBox.height=10;
        myBox.width=5;
        double result = myBox.height * myBox.width * myBox.width;
        System.out.println(result);

    }
}
