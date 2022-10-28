package block2.block66;

public class massive {
    public static void main(String[] args) {

        int[] daysInMouth = new int[13];
        daysInMouth[0] = 31;
        daysInMouth[1] = 28;
        daysInMouth[2] = 31;
        daysInMouth[3] = 30;
        daysInMouth[4] = 30;
        daysInMouth[5] = 30;
        daysInMouth[6] = 30;
        daysInMouth[7] = 30;
        daysInMouth[8] = 30;
        daysInMouth[9] = 30;
        daysInMouth[10] = 30;
        daysInMouth[11] = 31;
        daysInMouth[12] = 32;

        int march = daysInMouth[2];
        System.out.println("Март " + march);

//        for (int i = 0; i < 12; i++) {
        for (int i = 0; i < daysInMouth.length; i++) {
            System.out.println(daysInMouth[i]);
        }
    }
}
