import java.util.Arrays;

public class SumArrayPuzzle
{
    static void sumArray(int[] arr)
    {
        int [] s=new int[arr.length];
        int k=0;
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for (int i=0;i<arr.length;i++)
        {
            s[k++]=sum-arr[i];
        }
        System.out.print(Arrays.toString(s));
    }
    public static void main(String[] args)
    {
        int [] arr={3,6,4,8,9};

        sumArray(arr);
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(Arrays.toString(res));
//        }
//        System.out.print(Arrays.toString(res));
//        System.out.println();
    }
}
