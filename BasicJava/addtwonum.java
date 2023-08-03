import java.util.Scanner;
class add{
    public int sum(int a,int b){
         
         return a+b;
    }
}
public class addtwonum {
    public static void main(String[] args) {
        add obj=new add();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number :");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("The sum is : "+obj.sum(a, b));
        sc.close();
    }
}
