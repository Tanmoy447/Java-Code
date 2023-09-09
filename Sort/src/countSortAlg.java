public class countSortAlg
{
    static int maxValue(int[] arr)
    {
        int max=arr[0];
        for(int i=1; i < arr.length;i++)
        {
            if (arr[i] > max)
                max=arr[i];
        }
        return max;
    }
    static void countSort(int[] arr)
    {
        int max=maxValue(arr);
        int[] count =new int[max+1];
        for (int i=0;i < arr.length; i++)
        {
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j< count[i];j++)
            {
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args)
    {
        int [] arr={9,8,7,6,5,4,3,2,1,0};
        countSort(arr);
        for (int value: arr) System.out.print(value+" ");

    }
}
