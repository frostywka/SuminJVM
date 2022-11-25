package block3_OOP.block34_constructor;

public class Box {
    double width;
    double height;
    double length;

//    Box(double width, double height, double length){
//        this.width =width;
//        this.height=height;
//        this.length=length;
//    }

    // создать автоматически через Alt+Insert
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume(){
        return width*height*length;
    }
}
