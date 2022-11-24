package block3_OOP.block33_parametrize_method.DZ;

public class Rect {

    double length; // длина
    double weight; // ширина

    void params(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    double perimetr() {
        return length * 2 + weight * 2;
    }

    double square() {
        return length * weight;
    }
}
