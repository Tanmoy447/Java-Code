package ArrayProblem;
import java.util.*;
class reverse{
    void revArray(){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.print("Enter the array :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //after reverse
        System.out.print("Reverse array is : ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
public class reverseArray {
    public static void main(String[] args) {

        reverse obj=new reverse();
        obj.revArray();
    }
}
