package _2D_Array_code;

import java.util.Scanner;
class add{
    void addMatrix(int[][] arr,int r1,int c1,int [][] arr2,int r2,int c2){
        if (r1!=r2 || c1!=c2){
            System.out.println("Wrong Input");
            return;
        }
        int[][] sum= new int[r1][c1];
        for (int i=0;i<r1;i++){
           for (int j=0;j<c1;j++){
               sum[i][j]=arr[i][j]+arr2[i][j];
           }
        }
        System.out.println("The sum array is :");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class matrixAdd {
    void printArray(int[][] arr){
        System.out.println("The array is :");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r1= sc.nextInt();
        System.out.println("Enter column : ");
        int c1=sc.nextInt();
        int [][] arr=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements :");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is :");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Enter rows : ");
        int r2= sc.nextInt();
        System.out.println("Enter column : ");
        int c2=sc.nextInt();
        int [][] arr2=new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements :");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is :");
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        add obj=new add();
        obj.addMatrix(arr,r1,c1,arr2,r2,c2);
    }
}
