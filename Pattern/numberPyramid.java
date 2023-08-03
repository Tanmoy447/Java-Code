import java.util.Scanner;
public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int m=i-1;m>0;m--){
                System.out.print(m);
            }
            System.out.println();
            sc.close();
        }
    }
}
