public class zerosToEnd
{
    static void bbSort(int[] arr)
    {
        int n=arr.length;
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j]==0 && arr[j+1] !=0)
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={0,5,0,3,42};
        bbSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
