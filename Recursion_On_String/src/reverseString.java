import java.util.Scanner;

public class reverseString {

    static String reverse(String s,int index){
        if (index==s.length())  return " ";
        String x=reverse(s,index+1);
        return x+s.charAt(index);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        System.out.println("The reverse string is : "+reverse(s,0));
        String rev=reverse(s,0);
        if (rev.equals(s)){
            System.out.println("It is a Palindrome .");
        }
        else {
            System.out.println("This is not a Palindrome .");
        }
    }
}
