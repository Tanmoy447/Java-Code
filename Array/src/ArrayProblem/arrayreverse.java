package ArrayProblem;

import java.util.Scanner;

public class arrayreverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            if (arr[left]!=arr[right])
            {
                System.out.println("Array is not palindrome");
                left++;
                right--;
            }
            else
            {
                System.out.println("Array is palindrome ");
            }
        }


    }
}
