package block3_OOP.block34_constructor.DZ;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Дядька","Клоун",30000);

//        System.out.println(worker.moneyOfYear(12));
        String info = worker.getInfo(12);
        System.out.println(info);
    }
}
