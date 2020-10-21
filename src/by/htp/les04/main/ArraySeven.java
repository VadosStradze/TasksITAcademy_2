package by.htp.les04.main;

public class ArraySeven {
    public static void g() {

        int[] array = new int[]{1,-3,3,4,6,3,4};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i<array.length;i++){
            if (array[i]>max){
                max =array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min+" "+max);
        for (int j = 0;j<array.length;j++){
            int rez = min;
            min =max;
            max = rez;
            if(array[j]==min){
                array[j]= max;
            }

        }
        for (int k:array
             ) {
            System.out.println(k);
        }
        //есть недочеты,прошу расписать задание поподробнее
    }
}
