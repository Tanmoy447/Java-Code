
import java.util.Scanner;
public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                int a=i+j;
                if(a%2==0)  System.out.print("1");
                else        System.out.print("2");

            }
            System.out.println();
            sc.close();
        }
    }
}
