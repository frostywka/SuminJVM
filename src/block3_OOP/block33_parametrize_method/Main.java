package block3_OOP.block33_parametrize_method;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int square = test.square(80); // для получения квадрата необходимо создать переменную, в которую положить значение
        System.out.println(square);

        Box box = new Box();
        box.setDimens(15,15,15);
        System.out.println(box.volume());
    }
}
