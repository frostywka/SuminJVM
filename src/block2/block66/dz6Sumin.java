package block2.block66;

public class dz6Sumin {
    public static void main(String[] args) {

        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }
        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];  // тут мы переписываем значения первого массива на новые значения но уже во второй массив
        }
        for (int i : second) {
            System.out.println(i);
        }
    }
}
