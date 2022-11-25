package block3_OOP.block35_reload_methods_and_constructor;

public class TestConstructor {
    double width;
    double height;
    double length;

    TestConstructor(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    TestConstructor(double size) {
        width = size;
        height = size;
        length = size;
    }

    TestConstructor() {
        width = 0;
        height = 0;
        length = 0;
    }

    double volume() {
        return width * length * height;
    }

    void showVolume() {
//        double volume = width * length * height; // никто не мешает внутри одного метода вызвать другой метод
//        double volume = volume();  // и тогда можно вообще не писать эту строчку , а оставить sout volume()
//        System.out.println(volume);
        System.out.println(volume());
    }

}
