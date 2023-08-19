package _2D_Array_code;

import java.util.Scanner;
class Generate{
    int[][] Spiral(int n){
        int [][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,leftColumn=0,rightColumn=n-1;
        int count=1;
        while (count<=n*n){
            // top row
            for (int j=leftColumn;j<=rightColumn && count<=n*n;j++){
                matrix[topRow][j]=count++;
            }
            topRow++;
            //right column 
            for (int i=topRow;i<=bottomRow && count<=n*n;i++){
                matrix[i][rightColumn]=count++;
            }
            rightColumn--;
            //bottom row
            for (int j=rightColumn;j>=leftColumn && count<=n*n;j--){
                matrix[bottomRow][j]=count++;
            }
            bottomRow--;
            //left column
            for (int i=bottomRow;i>=topRow && count<=n*n;i--){
                matrix[i][leftColumn]=count++;

            }
            leftColumn++;
        }
        return matrix;
    }
}
public class generateSppiral {
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
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        Generate obj=new Generate();
        int[][] matrix=obj.Spiral(n);
        System.out.println("The out put is : ");
        printMatrix(matrix);

    }
}
