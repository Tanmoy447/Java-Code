package ArrayProblem;
import java.util.*;
class repeatNo{
    int firstRepeat(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
public class firstRepeatingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter the array elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        repeatNo obj=new repeatNo();
        System.out.print("The repeating no is : "+obj.firstRepeat(arr));

    }
}
