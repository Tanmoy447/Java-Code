import java.util.Scanner;
//import java.utill.Methods_In_Java;
public class star
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows=sc.nextInt();
        //factoial obj =new factorial();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
           System.out.println();
           sc.close();
        }
      //  System.out.println();

    }
}
