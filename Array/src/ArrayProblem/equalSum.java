package ArrayProblem;

import java.util.Scanner;

public class equalSum {
    static int findSum(int[] arr){
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean EqualSum(int[] arr){
        int totalSum=findSum(arr);
        int prefixSum=0;
        for (int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if (prefixSum==suffixSum){
                return true;
            }
        }
        return false;
    }
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        printArray(arr);
        System.out.println(EqualSum(arr));

    }
}
