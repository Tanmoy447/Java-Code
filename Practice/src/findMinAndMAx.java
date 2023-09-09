import java.util.Scanner;

public class findMinAndMAx {
    static void minMAx(int[] arr){
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(max > arr[i]){
                max=arr[i];
            }
        }
        System.out.println("the min value is : "+max);
        for (int i=0;i<arr.length;i++){
            if (min < arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max value is : "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0;i <n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The array is : ");
        for (int i=0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        minMAx(arr);
    }
}
