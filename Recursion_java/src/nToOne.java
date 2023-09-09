import java.util.Scanner;

class PrintOne{

    void nToOnePrint(int n){

        if (n<=1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        nToOnePrint(n-1);
//            System.out.println(n);

    }
}
public class nToOne {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        PrintOne obj=new PrintOne();
        obj.nToOnePrint(n);
    }
}
