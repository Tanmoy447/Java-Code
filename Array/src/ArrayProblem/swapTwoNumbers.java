package ArrayProblem;
import java.util.*;
class swap{
    void swapNumbers(int a,int b){
        int temp=a;
        a=b;
        b=temp;

//        System.out.println("a :"+a);
//        System.out.println("b :"+b);
    }
}
public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number :");
        int a= sc.nextInt();
        System.out.print("Enter second number :");
        int b= sc.nextInt();
        swap obj=new swap();
        obj.swapNumbers(a,b);
    }
}
