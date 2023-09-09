import java.util.ArrayList;
import java.util.Scanner;

public class returnArrayList {

    static ArrayList<Integer> allIndex(int[] arr,int index,int x){

        ArrayList<Integer> ans=new ArrayList<>();
        if (index >= arr.length){
            return ans;
        }
        if (x == arr[index]){
            ans.add(index);
        }
        ArrayList<Integer> small=allIndex(arr,index+1,x);
        ans.addAll(small);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int x= sc.radix();
        int[] arr={1,2,3,4,5,4,3,2,1,1,1,1};
        ArrayList<Integer> ans=allIndex(arr,0,x);
        for (Integer i: ans){
            System.out.println(i);
        }

    }
}
