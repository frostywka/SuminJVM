package block3_OOP.block32_Methods;

public class Box {
    double width;
    double height;
    double length;

    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }

    double volume1() {
//            double volume = width * height * length;
//            return volume
//            Две строчки выше можно заменить на
        return width * height * length;

        // VOID не возвращает данные
        // пустые круглые скобки - метод не принимает параметры

        // Если метод возращает данные, То
        // используйте return, тип возвращаемых данных должен совпадать с типом,
        // указанным при объявлении метода

        // имяПеременной.метод(); - вызов метода
    }

}
