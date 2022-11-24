package block3_OOP.block31_vvedenieOOP.block31DZ;

public class Main {
    public static void main(String[] args) {

        Human man1 = new Human();
        man1.weight = 11;
        man1.old = 12;
        man1.name = "MAN1";
        Human man2 = new Human();
        man2.weight = 21;
        man2.old = 22;
        man2.name = "MAN2";
        Human man3 = new Human();
        man3.weight = 31;
        man3.old = 32;
        man3.name = "MAN3";
        Human man4 = new Human();
        man4.weight = 41;
        man4.old = 42;
        man4.name = "MAN4";
        Human man5 = new Human();
        man5.weight = 51;
        man5.old = 52;
        man5.name = "MAN5";

//        double resultOld = (man1.old + man2.old + man3.old + man4.old + man5.old)/5;
//        System.out.println(resultOld);

        Human[] man = new Human[5];
        man[0] = man1;
        man[1] = man2;
        man[2] = man3;
        man[3] = man4;
        man[4] = man5;

        int sum = 0;
        for (int i = 0; i < man.length; i++) {
            sum += man[i].old;
        }
        System.out.println(sum / (double) man.length);
    }
}
