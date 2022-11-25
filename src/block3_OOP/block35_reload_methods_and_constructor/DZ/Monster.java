package block3_OOP.block35_reload_methods_and_constructor.DZ;

public class Monster {
    //Задача
//        Создать класс Монстр, с 3-мя полями типа int (кол-во
//        глаз, ног и рук). Создать 4 конструктора (пустой, с 1-м параметром, 2-мя, 3-мя).
//        Если в параметрах конструтора не устанавливается какое-то значение, то установить его равным 2.

//            Создать методы
//        void voice(), который выводит на экран слово "Голос"
//        void voice(int i ), выводит слово голос i раз
//        void voice(int i , String word) выводит слово word i раз

    int eyes;
    int legs;
    int hands;

    public Monster() {
        eyes = 0;
        legs = 0;
        hands = 0;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }

    public Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = 2;
    }

    public Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
//        String result = "";
//        for (int a = 0; a < i; a++) {
//            result += "Голос";
//        }
//        System.out.println(result);
        for (int a = 0; a < i; a++) {
            System.out.println("Голос");
        }
    }

    void voice(int i, String word) {
//        String result = word;
//        for (int a = 0; a < i; a++) {
//            result += word;
//        }
//        System.out.println(result);
        for (int a = 0; a < i; a++) {
            System.out.println(word);
        }

    }

}
