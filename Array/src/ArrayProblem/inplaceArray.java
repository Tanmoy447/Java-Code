package ArrayProblem;
import java.util.Scanner;
class inplace{
    void swapArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
}
public class inplaceArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the array :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        inplace obj=new inplace();
        obj.reverse(arr);
        System.out.println("After swaping the array is :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
