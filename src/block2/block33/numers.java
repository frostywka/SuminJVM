package block2.block33;

public class numers {
    public static void main(String[] args) {

        int days = 1000;
        int speed = 300000;

        int seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);

        byte a = 127;
        a += 1;
        System.out.println(a); // принимает минимальное значение типа byte

        int aa = 15;
        byte bb = (byte) aa;

        System.out.println(bb);
    }
}
