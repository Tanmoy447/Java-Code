package ArrayProblem;

import java.util.Scanner;

public class querySum {
    static void printArray(int[] arr){
        for (int i=1;i<=arr.length;i++){
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
        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is : ");
        printArray(arr);
        int[] pref=prefixsum(arr);
//        printArray(pref);
        System.out.println("Enter no of query : ");
        int q= sc.nextInt();
        while (q-->0){
            System.out.println("Enter starting element : ");
            int l=sc.nextInt();
            System.out.println("Enter end element : ");
            int m=sc.nextInt();
            int ans=pref[m]-pref[l-1];
            System.out.println("The sum is : "+ans);
        }

    }
}
