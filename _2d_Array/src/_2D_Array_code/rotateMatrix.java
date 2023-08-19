package _2D_Array_code;

import java.util.Scanner;
class rotate{
    void Swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverseArray(int[] matrix){
        int i=0,j=matrix.length-1;
        while (i<j){
            Swap(matrix,i,j);
            i++;
            j--;
        }

    }
    void rotatematrix(int[][] matrix,int n){
        matrixInPlace(matrix,n,n);
        for (int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }

    }
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
public class rotateMatrix {
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
        rotate obj=new rotate();
        obj.matrixInPlace(matrix,r,c);
        obj.rotatematrix(matrix,r);
        System.out.println("Rotate matrix is : ");
        printMatrix(matrix);
    }
}

