package block3_OOP.block32_Methods.block32DZ;

public class Dog {
    String name;
    String poroda;
    int speed;

//    void run() {
//        for (int i = 0; i < speed; i++)
//            System.out.println("Бегу");
//    }

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";

            //Проверяем последнее ли это слово "бегу" - если последнее, то ставим точку, если нет, то ставим запятую и пробел
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    String info() {
        return name + "\n" + poroda + "\n" + speed;
    }
}
