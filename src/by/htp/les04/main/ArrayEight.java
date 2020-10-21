package by.htp.les04.main;

public class ArrayEight {
    public static void h(){
        int[] array=new int[]{1,0,3,5,-3,13};
        for(int i=0;i<array.length;i++){
            if (array[i]>i){
                System.out.println(array[i]);
            }
        }
    }
}
