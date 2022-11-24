package block3_OOP.block33_parametrize_method.DZ;

public class Main {
    public static void main(String[] args) {
        // Создать класс Rect(прямоугольник), к вотором будет 2 поля - длина и ширина
        // Объявить 3 метода:
        // 1) Метод, который принимает 2 параметра - длину и ширину, и устанавливает их у нашего прямоугольника
        // 2) Метод без параметров - возврашаеи периметр прямоугольника
        // 3) Метод без параметров - возвращает площадь прямоугольника
        // Продемонстрировать работу методов в классе Main

        Rect rect = new Rect();
        rect.params(10, 15);
        System.out.println(rect.perimetr());
        System.out.println(rect.square());

    }
}
