import java.util.*;
class sum{
    int pairs(int a,int b){
        int s=a+b;
        return s;
    }
}
public class sumPaires {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();
        sum obj=new sum();
        System.out.println("The sum is : "+obj.pairs(a,b));
    }
}
