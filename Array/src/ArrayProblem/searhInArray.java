package ArrayProblem;

import java.util.Scanner;

public class searhInArray {
    static int[] frequencyArray(int[] arr){
        int[] freq= new int[1000005];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
         int[] arr=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq=frequencyArray(arr);
        System.out.println("Enter number of quires : ");
        int q= sc.nextInt();
        while (q>0){
            System.out.print("Enter no to be searched : ");
            int x=sc.nextInt();
            if (freq[x]>0){
                System.out.println("YES");
            }
            else {
                System.out.println("No");
            }
            q--;

        }


    }
}
