
import java.util.Scanner;

public class rotationOfArray {
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotateArray(int[] arr, int k){
        k=k%arr.length;
        int[] ans =new int[arr.length];
        int j=0;
        for (int i= arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements ");
        int n=sc.nextInt();
        System.out.println("Enter no of rotation : ");
        int k= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements ");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //rotate obj=new rotate();
        System.out.println("Before rotation the array is : ");
        printArray(arr);
        //obj.rotateArray(arr,k);
        int[] ans=rotateArray(arr,k);
        System.out.println("After rotation array is ");
        printArray(ans);

    }
}
