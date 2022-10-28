package block2.block21;

public class DZ1 {
    public static void main(String[] args) {

        int seconds = 700000001;

        int secondsInMinute = 60;
        int secondsInHours = secondsInMinute * 60;
        int secondsInDays = secondsInHours * 24;

        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinute;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinute;

        System.out.println("Всего секунд:" + seconds);
        System.out.println("Дней:" + days);
        System.out.println("Часов:" + hours);
        System.out.println("Минут:" + minutes);
        System.out.println("Оставшихся секунд:" + leftSeconds);
    }
}
