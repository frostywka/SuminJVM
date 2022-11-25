package block3_OOP.block35_reload_methods_and_constructor.DZ;

public class Main {
    public static void main(String[] args) {

        //Задача
//        Создать класс Монстр, с 3-мя полями типа int (кол-во
//        глаз, ног и рук). Создать 4 конструктора (пустой, с 1-м параметром, 2-мя, 3-мя).
//        Если в параметрах конструтора не устанавливается какое-то значение, то установить его равным 2.

//            Создать методы
//        void voice(), который выводит на экран слово "Голос"
//        void voice(int i ), выводит слово голос i раз
//        void voice(int i , String word) выводит слово word i раз

        Monster monster1 = new Monster(2,2,2);
        Monster monster2 = new Monster(1,1,1);

        monster1.voice();

        monster1.voice(5);
        monster1.voice(2,"Помогите");
    }
}
