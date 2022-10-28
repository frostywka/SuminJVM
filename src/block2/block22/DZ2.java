package block2.block22;

import java.sql.SQLOutput;

public class DZ2 {
    public static void main(String[] args) {

        int money = 299;
        // >500р пицца
        // 300-500р шаурма
        // 100-300 гамбургер
        // <100 доширак
        // вывести название продукта на который хватает денег


        System.out.println("Всего денег " + money);
        if (money > 500) {
            System.out.println("Денег хватает на Пиццу");
//        } else if (money > 300 & money < 500) {
        } else if (money >= 300) {
            System.out.println("Денег хватает только на шаурму");
        } else if (money > 100 & money < 300) {
            System.out.println("Денег хватает только на гамбургер");
        } else {
            System.out.println("Придется есть дошик");
        }

    }
}
