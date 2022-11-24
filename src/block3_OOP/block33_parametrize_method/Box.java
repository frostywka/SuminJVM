package block3_OOP.block33_parametrize_method;

public class Box {
    double width;
    double height;
    double length;

    void setDimens(double width, double height, double length) {
//    void setDimens(double a, double b, double c){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return width * height * length;
    }
}
