import java.util.Scanner;

public class LinearSearch {

    static void printAllIndex(int[] arr,int index,int x){
        if (index >= arr.length)  return;
        if (x == arr[index]) System.out.println("The index is : "+index);
        printAllIndex(arr,index+1,x);
    }

    static boolean search(int[] arr,int index,int x){

       if (index>=arr.length)   return false;
       if (x==arr[index]) return true;
       return search(arr,index+1,x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,8,6,7,8,9,1,11,1,1,1};
        System.out.print("Enter the number : ");
        int x= sc.nextInt();
        if (search(arr,0,x)) System.out.println("True");
        else System.out.println("False");
        printAllIndex(arr,0,x);

    }
}
