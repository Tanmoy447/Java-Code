import java.util.Scanner;

public class findGCD {

    static int GCD(int x,int y){
       if (y==0){
           return x;
       }

        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x= sc.nextInt();
        System.out.println("Enter second number : ");
        int y=sc.nextInt();
        System.out.println("The GCD is : "+GCD(x,y));
        sc.close();
    }
}
