public class printArray {

    static void recArray(int[] arr,int index){

        if (index==arr.length)  return;
        System.out.print(arr[index] +" ");
        recArray(arr,index+1);

    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7};
        recArray(arr,0);
    }
}
