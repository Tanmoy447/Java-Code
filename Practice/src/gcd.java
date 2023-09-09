import java.util.Scanner;

public class gcd
{
    static int findGCD(int x,int y)
    {
        if (y<=0)   return x;
        return findGCD(y,x%y);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int x= sc.nextInt();
        System.out.println("Enter second number ");
        int y= sc.nextInt();
        System.out.println("The GCD is : "+findGCD(x,y));

    }
}
