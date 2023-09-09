
import java.util.Scanner;

class sortArray{
    void sorting(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j] < arr[j+1]){             // increasing array
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n= sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sortArray obj=new sortArray();
        obj.sorting(arr);
        System.out.println("After sorting array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
