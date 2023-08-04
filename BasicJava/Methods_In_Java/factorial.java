package Methods_In_Java;
import java.util.*;

class sum{
    public int fact(int n){                     //Methods
        if (n<=1)   return 1;
        return n*fact(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        sum obj=new sum();                              //creating object of class
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt( );
        System.out.println("the factorial is : "+ obj.fact(n));     //creating obj of methods
        sc.close();

    }
}
