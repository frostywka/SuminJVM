package block2.block44;

public class FloatDouble {
    public static void main(String[] args) {
// float(4байте) double(8байт)

        float r = 10.8f;
        float pi = 3.14f;
        float s = pi * r * r;

        System.out.println("Площадь круга равна " + s);

        double sqrt = Math.sqrt(36);
        System.out.println(sqrt);

        //char

        char ch1 = 89;
        ch1 += 1;
        char ch2 = 'Y';
        System.out.println("ch1 - " + ch1 + " ch2 - " + ch2);

        //boolean (true false)

        int temp = 22;
        int time = 24;
        boolean late = time >= 23;
        boolean hot = temp > 25;
//        if (temp > 25){
        if (!hot && late) {
            System.out.println("Кондиционер выключен");
        }


    }
}
