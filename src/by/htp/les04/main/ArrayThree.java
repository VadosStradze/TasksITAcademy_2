package by.htp.les04.main;

public class ArrayThree {
    public static void c() {
        //3
        int i;
        int j;
        int[] array = new int[]{-1, 0, 0, -1, 6};

            for (i = 0, j = 1; i < array.length-1; i++,j++) {
                if (array[i] < array[j]) {
                    System.out.println("Возрастающая последовательность");
                }else if(array[i] <= array[j]){
                    System.out.println("Неубывающая последовательность");
                }else {
                    System.out.println("Убывающая последовательность");
                }
            }
    }
}

