package by.htp.les04.main;

import java.util.Scanner;

public class ArrayFour {
    public static void d(){
        //4
        Scanner scanner = new Scanner(System.in);
        int i;
        int j=0;
        int count=0;//позиция элемента 2-ого массива
        int n;
        System.out.print("Задайте размер массива"+'\n'+"> ");
        n = scanner.nextInt();
        int[] array = new int[n];
        //Задаем размер 1-ого массива и убираем 0 из рандома
        for (i = 0; i<array.length;i++){
            array[i] = (int) (Math.random()*20+1);
            System.out.printf("[%2d]",array[i]);
            }
        //Задаем размер 2-ого массива
        for (i=0; i<array.length;i++){
            if (array[i]%2==0){
                j++;
            }
        }
        //Проверяем 2-ой массив
        if (j==0){
            System.out.println("В массиве нет четных чисел");
        }
        int[] secondArray = new int[j];
        //Присваиваем четные элементы
        for (i=0; i<array.length;i++){
            if (array[i]%2==0){
                secondArray[count]=array[i];
                count++;
            }
        }
        for (j = 0 ; j<secondArray.length;j++){
            System.out.print("{"+secondArray[j]+"} ");
        }
    }
}
