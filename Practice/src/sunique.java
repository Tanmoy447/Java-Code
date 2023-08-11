import java.util.*;
class search{
    int uniqueElement(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return  -1;
    }
}

public class sunique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        System.out.print("Enter The array elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        search obj=new search();
//        obj.uniqueElement(arr);
        System.out.print("The first repeating no is: "+obj.uniqueElement(arr));
    }
}
