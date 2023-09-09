public class quickSort
{
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partion(int[] arr,int start,int end)
    {
        int pivot=arr[start];
        int count=0;
        for (int i=start+1;i <= end;i++)
        {
            if (arr[i] <= pivot)        count++;
        }
        int pivotIdx=start+count;
        swap(arr,start,pivotIdx);
        int i=start,j=end;
        while (i < pivotIdx && j > pivotIdx)
        {
            while (arr[i] <= pivot)     i++;
            while (arr[j] > pivot)      j--;
            if (i < pivotIdx && j > pivotIdx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;

    }
    static void quickSORT(int[] arr,int start,int end)
    {
        if (start >= end)       return;
        int pi=partion(arr,start,end);
        quickSORT(arr,0,pi-1);
        quickSORT(arr,pi+1,end);
    }
    public static void main(String[] args)
    {
        int[] arr={3,2,1,4,5,6,9,8,7};
        quickSORT(arr,0, arr.length-1);
        for (int x:arr)
        {
            System.out.print(x+" ");
        }

    }
}
