package block2.block55;

public class loop2 {
    public static void main(String[] args) {
//        4 вида цикла
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
        // Задача вывести все четные числа от 1000 до 0

        int a = 100;
        while (a > 0) {
            if (a % 2 == 0) {
                System.out.println("четные числа " + a);
            }
            a--;
        }

        // задача посчитать среднее арифметическое всех чисел от 0 до 100

        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println("среднее арифметическое " + result);

        // запускает цикл хотя бы один раз
        int aa = 0;
        do {
            System.out.println("Привет");
        } while (a > 0);


        // Цикл FOR
        // цикл подходит когда нужно повторить операцию некоторое(известное) количество раз
        for (int q = 1000; q > 0; q--) {
            if (q % 3 == 0) {
                System.out.println(q);
            }
        }
        // вывести все нечетные числа от 100 до 1000 которые делятся без остатка на 5
        for (int w = 100; w < 1000; w++) {
            if (w % 2 == 1) {
                if (w % 5 == 0) {
                    System.out.println("Все нечетные числа, которые делятся без остатка на 5 " + w);
                }
            }
        }
    }
}


