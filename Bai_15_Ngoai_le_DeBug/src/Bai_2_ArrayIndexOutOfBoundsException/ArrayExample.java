package Bai_2_ArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer [] createRandom(){
        Random rd = new Random();
        Integer [] arr = new Integer [100];
        System.out.println("Các phần tử của mảng:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }
}