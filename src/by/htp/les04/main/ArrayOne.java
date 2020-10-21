package by.htp.les04.main;

import java.util.Random;
import java.util.Scanner;

public class ArrayOne {

    public static void a(){
        //1
        Scanner scanner = new Scanner(System.in);
        int i;
        int k;
        int sum=0;
        int n;
        Random rand = new Random();
        System.out.println("Введите  размер массива N: ");
        n =scanner.nextInt();
        System.out.println("Введите K: ");
        k = scanner.nextInt();
        int[] array = new int[n];
        for(i=0; i<n;i++){
            array[i] =rand.nextInt(100);
            if (array[i]==0){
                array[i] = rand.nextInt(100);
            }
        }
        for (i=0;i< array.length;i++){
            System.out.printf("[%2d]",array[i]);
            if (array[i]%k==0){
                System.out.println(true);
                sum = sum + array[i];
            }else {
                System.out.println(false);
            }
        }
        System.out.println(" Sum = "+sum);


    }

}