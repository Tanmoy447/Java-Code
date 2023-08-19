import java.util.Scanner;

//import static java.util.Collections.swap;

class sort{
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void SortArray(int[] arr){
        int left=0,right=arr.length-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
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

    }
}
public class SortZeroAndOne {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is : ");
        printArray(arr);
        sort obj=new sort();
        System.out.println("Sorted array is : ");
        obj.SortArray(arr);
        printArray(arr);
    }
}
