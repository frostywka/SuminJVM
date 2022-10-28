package block2.block55;

public class loop {
    public static void main(String[] args) {

        int a = 10;
        a += 1; // a= a+1;
//        a++ ;// инкремента
//        а--; // уменьшить;

        // вывести все числа от 1 до 1000 , каждое с новой строки

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }

        // задача ! вывести все четные числа от 1000 до 0

        int y = 10;
        while (y >= 0) {
            if (y % 2 == 0) {
                System.out.println(y);
            }
            y--;
        }

        // задача посчитать среднее арифметическое всех чисел от 0 до 100

        int sum = 0;
        int count = 1;
        while (count <= 10) {
            sum += count;
            count++;

            float result = sum / (float) count;
            System.out.println(result);
        }


        int aa = 0;
        do {
            System.out.println("Привет");
        }
        while (aa > 0);


        // ЦИкл FOR
        // (переменная счетчик , условие которое должно выполняться, действие после блока кода
        for (int w = 0; w < 10; w++) {
            System.out.println("Переменная W = " + w);
        }

        // вывести все числе от 1000 до 0, которые делятся на 3 без остатка
        for (int s = 100; s > 0; s--) {
            if (s % 3 == 0) {
                System.out.println("Все числа, которые делятся на 3 без остатся - " + s);
            }
        }
    }
}
