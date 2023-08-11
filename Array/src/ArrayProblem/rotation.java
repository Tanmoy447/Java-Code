package ArrayProblem;

import java.util.Scanner;

class rotate{
    void printArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void rotate(int arr[],int k){
        k=k% arr.length;
        int ans[]=new int[arr.length];
        int j=0;
        for (int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        System.out.println();
        System.out.println("After rotation array is ");
        printArray(ans);
    }
}

public class rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rotate obj=new rotate();
        System.out.println("Enter array size : ");
        int n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+" elements ");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter no of rotation : ");
        int k=sc.nextInt();
        System.out.println("Before rotation  array is : ");
        obj.printArray(arr);
        obj.rotate(arr,k);
//        obj.printArray(ans);
    }
}
