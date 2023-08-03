import java.util.*;
public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter the column : ");
        int column=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || j==1 || i==rows || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
            sc.close(); 
        }
    }
}
