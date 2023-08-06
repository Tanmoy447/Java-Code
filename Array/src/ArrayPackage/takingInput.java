package ArrayPackage;
import java.util.Scanner;
public class takingInput {
    static void printArray(int arr[]){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println("Arr elements :");
        printArray(arr);
        int arr2[]=arr;
        System.out.println("Arr2 elements :");
        printArray(arr2);
    }


}
