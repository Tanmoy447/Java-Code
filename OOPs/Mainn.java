import java.util.Scanner;
class Adittion{
    int add(int a, int b){
        int ans=a+b;
        return ans;
    }
}

public class Mainn {
    public static void main(String[] args) {
        Adittion obj=new Adittion();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();

        System.out.print("Sum of the numbers is : ");
        int ans=obj.add(a,b);
        System.out.print(ans);
        sc.close();
    }

}
