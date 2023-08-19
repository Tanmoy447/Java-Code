package _2D_Array_code;

import java.util.Scanner;

public class initialize2dArray {
    static void printArray(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int rows= sc.nextInt();
        System.out.println("Enter no of columns : ");
        int column= sc.nextInt();
        int[][] arr=new int[rows][column];
        System.out.println("Enter "+rows*column+" elements ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is : ");
        printArray(arr);
    }
}
