import java.util.Scanner;

public class seriesSum {

    static int seriesSum1(int n){

        if (n<=0)   return 0;
        if (n%2==0) return seriesSum1(n-1)-n;
        else        return seriesSum1(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int a=seriesSum1(n);
        System.out.println("The sum is : "+a);
    }
}
