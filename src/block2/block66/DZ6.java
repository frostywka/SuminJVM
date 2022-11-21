package block2.block66;

public class DZ6 {
    public static void main(String[] args) {
        // Создать массив чисел и  проинициализировать его значениями от 100 до 1000
        // создать второй массив по длине равный первому (использовать свойство lenght)
        //проинициализировать его значениями взятыми из первого массива, но в обратном порядке.
        // в цикле for each вывести все элементы второго массива

        int[] massive = new int[900];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 100;
        }
        int[] secondMassive = new int[massive.length];
        for (int i = 0, j = massive.length - 1; i < massive.length; i++, j--) {
            secondMassive[j] = massive[i];
        }
        for (int i : secondMassive){
            System.out.println(i);
        }

    }
}

