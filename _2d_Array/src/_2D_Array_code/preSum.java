package _2D_Array_code;

import java.util.Scanner;

class preesum {
    int sum1=0;
    int sum2=0;
    int prefixSum(int [][] matrix, int r1, int c1, int r2, int c2){

        for (int i=r1;i<=c2;i++){
            for (int j=c1;j<=r2;j++){
                sum1=sum1+matrix[i][j];
            }
        }
        return sum1;
    }
    void findPrefixSum(int [][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    int prefixSum2(int [][] matrix, int r1, int c1, int r2, int c2){

        findPrefixSum(matrix);
        for (int i=c1;i<=c2;i++){
            if (c1>=1)
                sum2+=matrix[i][c2]-matrix[i][c1-1];
            else
                sum2+=matrix[i][c2];
        }
        return sum2;
    }
}
public class preSum {
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
        System.out.println("Enter row number & column number : ");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] matrix=new int[r][c];
        System.out.println("enter "+r*c+" elements : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        printMatrix(matrix);
        System.out.println("Enter r1 and c1 : ");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("Enter c2 and r2 : ");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        preesum obj=new preesum();
        int sum=obj.prefixSum(matrix,r1,c1,r2,c2);
        System.out.println("Sum is :"+sum);
        int sum2=obj.prefixSum2(matrix,r1,c1,r2,c2);
        System.out.println("The sum2 is : "+sum2);
    }
}
