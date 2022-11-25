package block3_OOP.block35_reload_methods_and_constructor;

public class Main {
    public static void main(String[] args) {

//        Test test = new Test();
//        int result = test.multiple(5);
        int result = TestMethods.multiple(5);


        System.out.println(result);

        TestConstructor box = new TestConstructor(10);
        TestConstructor box2 = new TestConstructor(12, 12, 13);
        TestConstructor box3 = new TestConstructor();

        box.showVolume();
        box2.showVolume();
        box3.showVolume();



    }
}
