package ArrayProblem;

import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixsum(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is : ");
        printArray(arr);
        System.out.println("After sum array is : ");
        int[] pref=prefixsum(arr);
        printArray(pref);

    }
}
