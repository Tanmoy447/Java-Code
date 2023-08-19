package _2D_Array_code;

import java.util.Scanner;

class Triangle{
    int[][] Pascal(int n){
        int[][] ans=new int[n][];
        for (int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
                for (int j=1;j<i;j++){
                    ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
                }
        }
        return ans;
    }
}
public class pascalsTriangle {
    static void printMatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of n :");
        int n= sc.nextInt();
        Triangle obj=new Triangle();
        int[][] ans=obj.Pascal(n);
        System.out.println("The pascal's triangle is : ");
        printMatrix(ans);
    }
}
