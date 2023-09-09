package Strings;
import java.util.*;
public class builder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder();
        str= new StringBuilder("Hellow");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
    }
}
