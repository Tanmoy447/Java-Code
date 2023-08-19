import java.util.Scanner;

public class removeOccurances {

    static String Occurrences(String name,int index) {
        if (index==name.length())   return " ";
        String curr=Occurrences(name,index+1);
        char s=name.charAt(index);
        if (s != 'a')   return s+curr;
        else   return curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name : ");
        String name=sc.nextLine();
        System.out.println("The ans is : "+Occurrences(name,0));

    }
}
