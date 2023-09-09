package ArrayPackage;

public class xyz
{
        static int firstMax(int [] arr)
        {
            int x=Integer.MIN_VALUE;
            for (int i=0;i<arr.length;i++){
                if (x < arr[i]){
                    x=arr[i];
                }
            }
            return x;
        }
        static int SecondMax(int[] arr)
        {
            int x=firstMax(arr);
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]==x)
                {
                    arr[i]=Integer.MIN_VALUE;
                }
            }

            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]>x)
                {
                    x=arr[i];
                }
            }
            int nexMax=firstMax(arr);
            return nexMax;

        }
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5};

            xyz obj=new xyz();

            System.out.println( xyz.SecondMax(arr));
        }


}
