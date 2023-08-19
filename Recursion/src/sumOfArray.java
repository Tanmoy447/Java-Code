public class sumOfArray {

    static int sum(int[] arr,int index){
        if (index==arr.length)      return 0;

        return arr[index]+sum(arr,index+1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,8};
        System.out.println("The sum is : "+sum(arr,0));

    }
}
