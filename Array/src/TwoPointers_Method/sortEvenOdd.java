package TwoPointers_Method;

import java.util.Scanner;

class SoortArray{
    void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void sortArray(int[] arr){
        int left=0,right =arr.length-1;
        while (left<right){
            if (arr[left]%2==1 && arr[right]%2 ==0){
                Swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2 ==1){
                right--;
            }
        }
    }
}
public class sortEvenOdd {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SoortArray obj=new SoortArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Array :");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        printArray(arr);
        System.out.println("The sorted array is : ");
        obj.sortArray(arr);
        printArray(arr);

    }
}
