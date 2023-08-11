package TwoPointers_Method;
import java.util.Scanner;

class sortArray{
    void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void SortArray(int[] arr){

        // two pointer method

        int left=0,right=arr.length-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                Swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        // normal method
//        int zeros=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==0){
//                zeros++;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            if (i<zeros){
//                arr[i]=0;
//            }
//            else {
//                arr[i]=1;
//            }
//        }
    }
}
public class sortZeroAndOne {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        sortArray obj=new sortArray();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of array :");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is : ");
        printArray(arr);
        System.out.println("The sorted array is : ");
        obj.SortArray(arr);
        printArray(arr);
    }
}
