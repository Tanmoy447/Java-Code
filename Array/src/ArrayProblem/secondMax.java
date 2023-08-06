package ArrayProblem;
import java.util.*;
class maximum{
    int secmax(int arr[]){
        int x=Integer.MIN_VALUE;
        //find max
        for (int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }
        return x;
    }
    int nextMax(int arr[]){
        int x=secmax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        //find second max
        for (int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }
        int nextmax=secmax(arr);
        return nextmax;
    }

}
public class secondMax {
    public static void main(String[] args) {
        maximum obj=new maximum();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=sc.nextInt();

        //taking the input of array

        int arr[]=new int[n];
        System.out.print("Enter the elements of array :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //printing the output
        System.out.print("The array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //obj.secmax(arr);
        System.out.println("The first max element is :"+obj.secmax(arr));
        System.out.println("The second max is :"+obj.nextMax(arr));

    }
}
