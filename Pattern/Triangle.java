import java.util.*;
public class Triangle{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.print("Enter no of rows : ");
       int rows=sc.nextInt();
       for(int i=1;i<=rows;i++){
        for(int k=1;k<=rows-i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            
            System.out.print("*");
        }
        System.out.println();
        sc.close();
       }
    }
}
