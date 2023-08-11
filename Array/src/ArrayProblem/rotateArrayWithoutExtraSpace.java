package ArrayProblem;

import java.util.Scanner;

public class rotateArrayWithoutExtraSpace {
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapp(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reeverse(int arr[],int i,int j){
        while (i<j){
            swapp(arr,i,j);
            i++;
            j--;
        }

    }
    static void rotateInplace(int arr[],int k){
        k=k%arr.length;
        reeverse(arr,0,arr.length-k-1);
        reeverse(arr,arr.length-k,arr.length-1);
        reeverse(arr,0,arr.length-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter no of rotation");
        int k=sc.nextInt();
        System.out.println("Enter the elements ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before rotation array is :");
        printArray(arr);
        rotateInplace(arr,k);
        System.out.println("array after rotation :");
        printArray(arr);
    }
}
