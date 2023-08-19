package _2D_Array_code;
import java.util.Scanner;
class prefix {

    void findSumRowColumn(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // row prefix sum

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        // column prefix sum

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 1; i < matrix[0].length; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    int prefixSumRow1(int[][] matrix, int r1, int c1, int r2, int c2) {

        int ans = 0, sum = 0, left = 0, up = 0, leftup = 0;
        findSumRowColumn(matrix);
        sum = matrix[r2][c2];
        if (c1>=1)              left = matrix[r2][c1 - 1];
        if (r1>=1)              up = matrix[r1 - 1][c2];
        if (r1 >=1 && c1>=1)    leftup = matrix[r1 - 1][c1 - 1];
        ans = sum - left - up + leftup;
        return ans;
    }
}
public class prefixSumColumn {
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
        prefix obj=new prefix();
        int ans=obj.prefixSumRow1(matrix,r1,c1,r2,c2);
        System.out.println("The sum is : "+ans);
    }
}
