package _2D_Array_code;

import java.util.Scanner;
class Spiral{
    void order(int [][] matrix ,int r,int c){
        int totalElements =0;
        int firstRow=0,bottomRow=r-1,leftColumn=0,rightColumn=c-1;
       while (totalElements<r*c){
           //printing first row
           for (int j=leftColumn;j<=rightColumn && totalElements<r*c;j++){
               System.out.print(matrix[firstRow][j]+" ");
               totalElements++;
           }
           firstRow++;
           //printing right column->
           for (int i=firstRow;i<=bottomRow && totalElements<r*c;i++){
               System.out.print(matrix[i][rightColumn]+" ");
               totalElements++;
           }
           rightColumn--;
           //printing bottom row
           for (int j=rightColumn;j>=leftColumn && totalElements<r*c;j--){
               System.out.print(matrix[rightColumn][j]+" ");
               totalElements++;
           }
           bottomRow--;
           //printing left comumn
           for (int i=bottomRow;i>=firstRow && totalElements<r*c;i--){
               System.out.print(matrix[i][leftColumn]+" ");
               totalElements++;
           }
           leftColumn++;
       }

    }
}
public class spiralOrder {
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
        System.out.println("Enter no of columns : ");
        int c= sc.nextInt();
        int [][] matrix=new int[r][c];
        System.out.println("Enter "+r*c+" elements : ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        printMatrix(matrix);
        Spiral obj=new Spiral();
        System.out.println("Spiral order is : ");
        obj.order(matrix,r,c);

//        printMatrix(matrix);
    }
}
