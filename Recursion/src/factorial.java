import java.util.Scanner;

public class factorial {

    static int fact(int n){

        if (n<=1)       return 1;
        return  n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner scs=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n= scs.nextInt();
        int a=fact(n);
        System.out.println("The factorial of "+n+" is : "+a);
    }
}
