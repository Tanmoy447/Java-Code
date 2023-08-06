package ArrayPackage;
import java.util.Scanner;
public class userInput {
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements :");
        for (int i=0;i<arr.length;i++){                 //taking input from user
            arr[i]=sc.nextInt();
        }
        System.out.print("The array elements are :");
        printArray(arr);                                //printing the array
        sc.close();
        userInput obj=new userInput();
    }
}
