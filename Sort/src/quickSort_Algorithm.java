public class quickSort_Algorithm

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
        for (int i=start+1;i<=end;i++)
        {
            if (arr[i] <= pivot)    count++;
        }
        int pivotIdx=start+count;
        swap(arr,start,pivotIdx);
        int i=start,j=end;
        while (i<pivotIdx && j>pivotIdx)
        {
            while (arr[i]<=pivot)    i++;
            while (arr[j]>pivot)    j--;
            if (i<pivotIdx && j>pivotIdx)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }


        return pivotIdx;
    }
    static void quickSort(int[] arr,int start,int end)
    {
        if (start >= end)   return;
        int pi=partion(arr,start,end);
        quickSort(arr,0,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[] args)

    {
        int [] arr={4,3,5,2,6,1,7,0,1,-1,-2};
        quickSort(arr,0,arr.length-1);

        for (int val: arr)
        {
            System.out.print(val+" ");
        }

    }
}
