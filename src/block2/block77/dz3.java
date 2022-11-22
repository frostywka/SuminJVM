package block2.block77;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {

        // Написать программу, которая принимает строковую переменную с названием месяца.
        // И если месяц введен правильно, то вывести на экран время года, к которому этот месяц относится
        // в противном случае вывести сообщение, что месяц не существует.

        // выполнить сначала при помощи if-else. а затем при помощите switch-case


//        String month = "январь";
        Scanner in = new Scanner(System.in);
        String month = in.next();

//        if (month.equals("Январь") || month.equals("январь") || month.equals("Февраль") || month.equals("февраль") || month.equals("Декабрь") || month.equals("декабрь")) {
//            System.out.println(month + " - это зимний месяца");
//        } else if (month.equals("Март") || month.equals("март") || month.equals("Апрель") || month.equals("апрель") || month.equals("Май") || month.equals("май")) {
//            System.out.println(month + " - это весенний месяца");
//        } else {
//            System.out.println("Месяц не существует");
//        }

        switch (month){
            case "Январь","январь","Февраль","февраль","Декабрь","декабрь":
                System.out.println(month + " - это зимний месяца");
                break;
            case "Март","март","Апрель","апрель","Май","май":
                System.out.println(month + " - это весенний месяца");
                break;
            default:
                System.out.println("Месяц не существует");
        }

        // или так
//        switch (month) {
//            case "Декабрь":
//            case "Январь":
//            case "Февраль":
//                System.out.println("Зима");
//                break;
//            case "Март":
//            case "Апрель":
//            case "Май":
//                System.out.println("Весна");
//                break;
//            case "Июнь":
//            case "Июль":
//            case "Август":
//                System.out.println("Лето");
//                break;
//            case "Сентябрь":
//            case "Октябрь":
//            case "Ноябрь":
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Несуществующее время года");
//                break;
        }
    }



