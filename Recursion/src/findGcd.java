import java.util.Scanner;

public class findGcd {


    static int GCD(int x,int y){
        if (y <=0)       return x;

        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int x= sc.nextInt();
        System.out.println("Enter second number : ");
        int y= sc.nextInt();

        System.out.println("Gcd is : "+GCD(x,y));
    }
}
