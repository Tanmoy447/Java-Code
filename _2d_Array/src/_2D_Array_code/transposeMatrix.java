package _2D_Array_code;

import java.util.Scanner;

class Transpose{
    // using another matrix
//    int[][] transpose(int[][] matrix,int r,int c){
//        int[][] ans=new int[c][r];
//        for (int i=0;i<c;i++){
//            for (int j=0;j<r;j++){
//                ans[i][j]=matrix[j][i];
//            }
//        }
//        return ans;
//    }
    //using same matrix
    void matrixInPlace(int[][] matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
public class transposeMatrix {

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
        System.out.println("Enter no of rows : ");
        int r= sc.nextInt();
        System.out.println("Enter no of column : ");
        int c= sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter "+totalElements+" elements ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        printMatrix(matrix);
        Transpose obj=new Transpose();
        System.out.println("Transpose matrix is : ");

//        int[][] ans= obj.transpose(matrix,r,c);
//        printMatrix(ans);
        obj.matrixInPlace(matrix,r,c);
        printMatrix(matrix);
    }
}
