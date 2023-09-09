import java.util.Scanner;

public class palindrome {

//    static String reverse(String s,int index) {
//        if (index == s.length()) return " ";
//        String x = reverse(s, index + 1);
//        return x + s.charAt(index);
//    }
    static boolean isPalindrome(String s,int start,int end){
        if (start>=end) return true;
        return (s.charAt(start)==s.charAt(end) && isPalindrome(s,start+1,end-1));
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
//        String rev=reverse(s,0);
//        if (rev.equals(s)){
//            System.out.println("It is a Palindrome .");
//        }
//        else {
//            System.out.println("This is not a Palindrome .");
//        }

            System.out.println(isPalindrome(s,0,s.length()-1));

    }
}
