package by.htp.les04.main;

import java.util.Scanner;

public class ArraySix {
    public static void f(){
        //6
        Scanner scanner = new Scanner(System.in);
        int i;
        int z = 15;
        int n;
        int counter = 0;
        System.out.println("Введите размер массива: ");
        n = scanner.nextInt();
        int[] array= new int[n];
        for (i = 0;i<array.length;i++){
            array[i]= (int)(Math.random()*30);
            if (array[i]>z){
                array[i]=z;
                counter++;

            }
        }
        for (int k:array) {
            System.out.println(k);
        }
        System.out.println("Количество замен: "+ counter);
    }
}
