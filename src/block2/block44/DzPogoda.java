package block2.block44;

public class DzPogoda {
    public static void main(String[] args) {

// поздно это после 23х часов или меньше 5 часов - то сон
        boolean weatherIsFine = true;
        boolean night = true;

//        if (!night && weatherIsFine) {
        if (!night && weatherIsFine) {
            System.out.println("Гулять");
        }
        if (night) {
            System.out.println("Спать");
        }
        if (!night && !weatherIsFine) {
            System.out.println("Читать");
        }
    }
}
