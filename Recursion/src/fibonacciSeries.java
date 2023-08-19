import java.util.Scanner;

public class fibonacciSeries {

    static int fibonacci(int n){

        if (n<=2)   return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int x=fibonacci(n);
        System.out.println("The sum of "+n+"th term of the series  is : "+x);
    }
}
