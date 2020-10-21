package by.htp.les04.main;

public class ArrayFive {
    public static void e(){
        int i;
        int[] array = new int[]{-5,23,0,5,7,-13,8};
        int min = array[0];
        int max = array[0];
        for (i=0;i<array.length;i++){
            System.out.println(array[i]);
            if (array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        int axisLength= Math.abs(min)+Math.abs(max);
        System.out.println("Наименьшая длина числовой оси = "+axisLength);
    }

}
