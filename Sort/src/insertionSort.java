import java.util.Scanner;

public class insertionSort {
    static void insertion_sort(int [] arr){
        for (int i=1;i < arr.length;i++){
            int j=i;
            while (j > 0 && arr[j] > arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,5,0,3,42};
        insertion_sort(arr);
        for (int i=0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
