package block2.block66;

public class forEach {
    public static void main(String[] args) {

        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10; // инициализвациия массива
        }
        for (int i : nums) {  // это цикл вывода всех элементов массива
                                // берет по очереди все элементы массива и присваивает их переменной i
                                // это как раз FOR EACH (не используется для изменения данных в массиве)
            System.out.println(i);
        }
    }
}
