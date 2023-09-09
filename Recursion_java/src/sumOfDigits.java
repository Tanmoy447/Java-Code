import java.util.Scanner;

public class sumOfDigits {

    static int SumDigits(int n){

        if (n <=0)   return 0;
        return SumDigits(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int a=SumDigits(n);
        System.out.println("The sum of digits of "+n+" is : "+a);
    }
}
