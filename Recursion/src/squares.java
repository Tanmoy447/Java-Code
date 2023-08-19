import java.util.Scanner;

public class squares {

    static int power(int p,int q){
        if (q < 1)   return 1;
        return p*power(p,q-1);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base : ");
        int p= sc.nextInt();
        System.out.println("Enter power : ");
        int q=sc.nextInt();
        int a=power(p,q);
        System.out.println("The power is : "+a);
    }
}
