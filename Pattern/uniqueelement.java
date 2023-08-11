import java.util.Scanner;

class unique{
    int uniqueee(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return  ans;
    }
}
public class uniqueelement {
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
        unique obj=new unique();
        System.out.println("The unique element is : "+obj.uniqueee(arr));
    }
}
