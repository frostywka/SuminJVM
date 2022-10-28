package block2.block77;

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {

        // Написать программу, которая принимает строковую переменную с назщванием месяца.
        // И если месяц введен правильно, то вывести на экран время года, к которому этот месяц обносится
        // в противном случае вывести сообщение, что месяц не существует.

        // выполнить сначала при помощи if-else. а затем при помощите switch-case


//        String month = "январь";
        Scanner in = new Scanner(System.in);
        String month = in.next();

//        if (month == "Январь" || month == "январь"){
//        if (month.equals("Январь") || month.equals("январь")){
//            System.out.println(month + " - это зимний месяца");
//        } else if (month == "Февраль"){
//            System.out.println(month + " - это зимний месяц");
//        } else {
//            System.out.println("Месяц не существует");
//        }

        switch (month){
            case "Январь":
                System.out.println(month + " - это зимний месяца");
                break;
            case "Февраль":
                System.out.println(month + " - это зимний месяца");
                break;
            default:
                System.out.println("Такой месяц не существует");
                break;
            }
        }

    }

