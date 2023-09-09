public class mergeSort2
{
    static void merge(int[] arr,int start,int mid,int end)
    {
        int a1=mid-start+1;
        int b1=end-mid;
        int[] left=new int[a1];
        int[] right=new int[b1];
        int i,j,k;
        for (i=0;i<a1;i++)
        {
            left[i]=arr[start+i];
        }
        for (j=0;j<b1;j++)
        {
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=start;
        while (i<a1 && j<b1)
        {
            if (left[i]<right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
            }
        }
        while (i<a1)    arr[k++]=left[i++];
        while (j<b1)    arr[k++]=right[j++];
    }
    static void ArraySortRecursion(int [] arr,int start,int end)
    {
        if (start>=end)     return;
        int mid=(start+end)/2;
        ArraySortRecursion(arr,start,mid);

        ArraySortRecursion(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6,7,9,8,1};
        int n=arr.length;
        ArraySortRecursion(arr,0,n-1);
        for (int val: arr)
        {
            System.out.print(val+" ");
        }
    }
}
