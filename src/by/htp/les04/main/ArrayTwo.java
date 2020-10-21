package by.htp.les04.main;

public class ArrayTwo {

    public static void b() {
        //2
        int i;
        int j=0;
        int count = 0;
        int[] array = new int[]{0,23,1,0,6,0,87,1,0,0};
        for (i = 0;i< array.length;i++){
            if (array[i]==0){
                j++;
            }
        }
        int []zeroArray = new int[j];
        for (i = 0;i<array.length;i++){
            if (array[i]==0){
                zeroArray[count]=i;
                count++;
            }
        }
        for (j=0;j<zeroArray.length;j++){
            System.out.printf("[%2d]",zeroArray[j]);
        }
        /*for (int h:zeroArray) {
            System.out.println(h);
        }*/
    }
}
