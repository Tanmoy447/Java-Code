
import java.util.*;
public class simplepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows+2;j++){
                System.out.print(j);
            }
            System.out.println();
            sc.close();
        }
    }
}
