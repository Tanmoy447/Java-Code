
import java.util.Scanner;
public class binaryTodecomal {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the binary number : ");
    int binary_num=sc.nextInt();
    int ans =0;     //decimal number
    int pw=1;       //power of 2
    while(binary_num>0){
        int unit_digit=binary_num%10;
        ans +=unit_digit*pw;
        binary_num/=10;
        pw*=2;
    }
    System.out.println(ans);
    sc.close();
   } 
}
