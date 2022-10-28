package block2.block77;

public class Space {
    public static void main(String[] args) {

//        int[] nums = new int[12];
//        nums[0] = 10;     // все это можно обозначить иначе - Ниже строкой
//        int[] nums = {1,2,3,4,5,6,7};

        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i : dayOfMonth){
            System.out.println(i);
        }

        // string строка
        String s = "Hello,World";
        System.out.println(s);

        String name = "Ilya";
        int age = 35;
        String result = "Привет, \'" + name + "\'``! \nТебе " + age + " лет.";
        System.out.println(result);
    }
}
