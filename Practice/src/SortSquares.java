import java.util.Scanner;
class sortsqr{
    int[] sortSqrs(int[] arr){
        int left=0,right=arr.length-1;
        int[] ans=new int[arr.length];
        int k=0;
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
}
public class SortSquares {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is : ");
        printArray(arr);

        sortsqr obj=new sortsqr();

        int [] ans= obj.sortSqrs(arr);
        System.out.println("Sorted array is : ");
        reverse(ans);
        printArray(reverse(ans));
    }
}
