package block2.block77;

public class dz2 {
    public static void main(String[] args) {

        // Написать программу, которая принимает номер месяца и выводит его название на экран,
        // если такого месяца нет, то вывести;
        // сти надпись "Месяц не существует"


        int numberOfMonth = 2;
//        if (numberOfMonth == 1){
//            System.out.println("Январь");
//        } else if (numberOfMonth == 2){   // ИНАЧЕ
//            System.out.println("Февраль");
//        } else {
//            System.out.println("Месяц не существует");
//        }

        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            default:
                System.out.println("Месяц не существует");
                break;

        }


    }
}
