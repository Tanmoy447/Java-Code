import java.util.Scanner;
class abc{
     int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        int s=a+b;
        return  s;
    }
}
public class intMethod {
    public static void main(String[] args) {
        int a=9;
        int b=9;
        abc obj=new abc();
//        obj.sum(a,b);
        System.out.println("The sum is :"+obj.sum());

    }
}
