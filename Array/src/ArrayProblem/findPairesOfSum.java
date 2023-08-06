package ArrayProblem;
import java.util.Scanner;
class fsum {

    void paires(){
//        int x=12;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int n=sc.nextInt();
        int count=0;
        //sum of elements
        System.out.print("The sum of the elements is :");
        int x=sc.nextInt();

//   //taking the array input
        int arr[]=new int[n];
        System.out.print("Enter the array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //printing the array output
        System.out.print("The array elements are :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //ultimate code
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x){
                    count++;
                    System.out.println("The pairs are:"+ "(" +i+","+j+")");
                }
            }
        }
        System.out.print("No of pairs are : "+count);
    }
}
public class findPairesOfSum {
    public static void main(String[] args) {
        fsum obj=new fsum();
        obj.paires();
    }
}
