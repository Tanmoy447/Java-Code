import java.util.Arrays;

public class lexicographicalOrder
{
    static void order(String [] str)
    {
        int n=str.length;
        for (int i=0;i<n-1;i++)
        {
            int minimum=i;
            for (int j=i+1;j<n;j++)
            {
                if (str[j].compareTo(str[minimum])<0)
                {
                    minimum=j;
                }
            }
            String temp=str[minimum];
            str[minimum]=str[i];
            str[i]=temp;
        }
    }
    public static void main(String[] args)
    {
        String[]  str={"apple","watermelon","kiwi","papaya","ball"};
        order(str);
        //Arrays.sort(str);
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");
        }

    }
}
