public class countSort_Algorithm
{
    static int findMax(int[] arr)
    {
        int max=arr[0];
        for (int i=1;i < arr.length;i++)
        {
            if (arr[i] > arr[0])
            {
                max=arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr)
    {
        int max=findMax(arr);
        int[] count=new int[max+1];
        for (int i=0;i < arr.length;i++)
        {
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i < count.length;i++)
        {
            for (int j=0;j < count[i];j++)
            {
                arr[k++]=i;
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr={3,5,6,7,3,2,8,9,22,-1};
        countSort(arr);
        for (int value:arr)     System.out.print(value+" ");

    }
}
