
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimal_num=sc.nextInt();
        int ans=0;   //binary number
        int pw=1;   //powers of 10
        while(decimal_num>0){
            int parity=decimal_num%2;
            ans +=parity*pw;
            decimal_num /=2;
            pw *=10;
        }
        System.out.println(ans);
        sc.close();
    }
}
