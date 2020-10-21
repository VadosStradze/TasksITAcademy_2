package by.htp.les04.main;

public class ArrayTen {
    public static void j(){
        int[] array= new int[]{1,2,3,4,5,6,7,8,9,10};
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        System.out.println(maxSum);
    }
}
