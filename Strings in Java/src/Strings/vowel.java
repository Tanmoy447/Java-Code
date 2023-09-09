package Strings;

import java.util.Arrays;

public class vowel
{
    public static void main(String[] args)
    {
        String str= "'a', 'c', 'd', 'e', 'f', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'";
        StringBuilder empty= new StringBuilder();
        for (int i=0;i<str.length();i++)
        {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
//                //System.out.print(str.charAt(i)+" ");
//                empty.append(empty.toString()).append(i);
                continue;
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(empty+" ");

    }
}

          //  if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'