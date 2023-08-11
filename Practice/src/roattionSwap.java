import java.util.Scanner;

public class roattionSwap {
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int arr[],int i,int j){
        while (i<j){
            swapArray(arr,i,j);
                i++;
                j--;
            }
        }
    static void rotateInPlace(int arr[],int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n=sc.nextInt();
        System.out.println("Enter no of rotation : ");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array : ");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before rotation array is : ");
        printArray(arr);
        System.out.println("After rotation array is : ");
        rotateInPlace(arr,k);
        printArray(arr);
    }
}
