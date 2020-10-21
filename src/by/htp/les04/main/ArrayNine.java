package by.htp.les04.main;

import java.util.Scanner;

public class ArrayNine {
    public static void i(){
        int i = 0;
        int n = 0;
        int zero = 0;
        int positive = 0;
        int negative = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  размер массива:"+'\n'+">: ");
        n = scanner.nextInt();
        int[]  array = new int[n];
        for (i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*30-15);
            System.out.printf("[%2d]"+"%n",array[i]);
        }
        for (i=0;i<array.length;i++){
            if (array[i]==0){
                zero++;
            }else if(array[i]<0){
                negative++;
            }else{
                positive++;
            }
        }
        System.out.println("Положительных элементов: "+positive);
        System.out.println("Отрицательных элементов: "+negative);
        System.out.println("Нулевых элементов: "+zero);
    }
}
