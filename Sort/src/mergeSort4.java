public class mergeSort4
{
    static void mergeSort(int[] arr,int start,int mid,int end)
    {
        int n1=mid-start+1;
        int n2=end-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++)
        {
            left[i]=arr[start+i];
        }
        for (j=0;j<n2;j++)
        {
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=start;
        while (i<n1 && j<n2)
        {
            if (left[i] < right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
            }

        }
        while (i<n1)    arr[k++]=left[i++];
        while (j<n2)    arr[k++]=right[j++];
    }
    static void recursion(int[] arr,int start,int end)
    {
        if (start >= end)    return;
        int mid=(start+end)/2;
        recursion(arr,start,mid);
        recursion(arr,mid+1,end);
        mergeSort(arr,start,mid,end);
    }
    public static void main(String[] args)
    {
        int [] arr={9,8,0,7,0,6,4,3,0};
        recursion(arr,0,arr.length-1);
        for (int value:arr) System.out.print(value+" ");
    }
}

