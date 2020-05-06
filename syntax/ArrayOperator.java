package basic.syntax;

import java.util.Arrays;


public class ArrayOperator {
    public static void main(String[] args) {
//        // declare
//        int[] arr;
//        arr = new int[]{1,2,3,4,5,6,7,8,9,0};
//        for(int x:arr){
//            System.out.print(x + " ");
//        }
//
//        int[] brr = {2,4,6,8,10};
//        for(int val: brr){
//            System.out.print(val + " ");
//        }

        // sort
        int[] arr1 = {8,4,9,0,4,7,3,6,10};
        Arrays.sort(arr1);
        arrayPrint(arr1);

        // copy
        int[] brr1 = {3,5,7,8,1,6};
        int[] brr2 = {100,700,300,500,900,200};
        System.arraycopy(brr1,2,brr2,0,3);
        arrayPrint(brr2);

        // raggedArray
        raggedArray();
    }

    public static void arrayPrint(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static void raggedArray(){
        int[][] raggedArr = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };
        for(int[] x:raggedArr){
            arrayPrint(x);
        }
    }

}
