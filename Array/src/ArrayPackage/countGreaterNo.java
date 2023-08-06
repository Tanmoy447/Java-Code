package ArrayPackage;
import java.util.Scanner;
class great {
    int x=100;
    int count=0;
    void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void greaterno(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        System.out.print("The number of grater no than "+ x +" is :"+ count);
    }

}
public class countGreaterNo {
    public static void main(String[] args) {
        great obj=new great();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //taking input
        System.out.print("Enter the array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The output of the array is :");
        obj.printArray(arr);
        obj.greaterno(arr);
    }
}
