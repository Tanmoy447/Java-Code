import java.util.Scanner;

public class convert
{
    static int convertFive(int num)
    {
        while (num !=0)
        {
            int rem=num%10;
            if (rem==0)
            {
                rem=5;
            }
            else
            {
                return ;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(convertFive(num));


    }
}
