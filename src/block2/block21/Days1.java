package block2.block21;

public class Days1 {
    public static void main(String[] args) {
        int days = 56002;

        int years = days / 365;
        int month = (days % 365) / 31;

        int leftDays = days - years * 365 - month * 31;

        System.out.println("Общее количество дней:" + days);
        System.out.println("Лет:" + years);
        System.out.println("Месяцев:" + month);
        System.out.println("Дней:" + leftDays);

    }
}
