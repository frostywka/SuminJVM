package block2.block55;

public class DZ55 {
    public static void main(String[] args) {

        // Вывести все нечетные числа от 100 до 1000, которые делятся без остатка на 5

        for (int i = 100; i <= 1000; i++) {
            if (i % 2 == 1) {
                if (i % 5 == 0) {
                    System.out.println("Все нечетные числа которые делятся на 5 = " + i);
                }
            }
        }
    }
}

