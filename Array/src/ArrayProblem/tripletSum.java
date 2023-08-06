package ArrayProblem;
import java.util.Scanner;
class adddd {
    void tripletSum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements in array :");
        int n=sc.nextInt();

        // sum of elements
        System.out.print("Enter sum of elements :");
        int x=sc.nextInt();

        //taking input of array
        int arr[]=new int[n];
        System.out.print("Enter the array elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //printing the array
        System.out.print("The array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //final code
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        count++;
                        System.out.println("The pairs are :"+"("+i+","+j+","+k+")");
                    }
                }
            }
        }
        System.out.println("The no of pairs are : "+count);


    }
}


public class tripletSum {
    public static void main(String[] args) {
        adddd obj=new adddd();
        obj.tripletSum();

    }
}
