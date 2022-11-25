package block3_OOP.block34_constructor.DZ;

public class Worker {
    String name;
    String post;
    int money;

    public Worker(String name, String post, int money) {
        this.name = name;
        this.post = post;
        this.money = money;
    }

//    int moneyOfYear(int i) {
//        return money * i;
//    }

    String getInfo(int i) {
        return "Сотрудник " + name + ", " + "Должность " + post + "," +
                " " + "за последние 12 месяцев получил " + money * i + " рублей";
    }

}
