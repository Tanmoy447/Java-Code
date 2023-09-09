import java.util.ArrayList;
import java.util.Arrays;

public class tripletFamily
{
    static ArrayList<Integer> findTriplet(int[] arr)
    {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;i<n;i++)
            {
                for (int k=j+1;k<n;k++)
                {
                    if (arr[i]+arr[j]==arr[k])
                    {
                        a.add(i);
                        a.add(j);
                        a.add(k);
                    }
                }
            }
        }


        return a;

    }
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,7};
        ArrayList<Integer> res=new ArrayList<>();
        res=findTriplet(arr);
        System.out.println(res);
    }
}
