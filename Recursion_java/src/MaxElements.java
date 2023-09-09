public class MaxElements {

    static int printMaxElements(int[] arr,int index){

        if (index==arr.length-1)        return arr[index];
        int x=printMaxElements(arr,index+1);
        return Math.max(arr[index],x);
    }
    public static void main(String[] args) {

        int[] arr={1,3,4,2,5,7,1,13};
        System.out.println("The max element is : "+printMaxElements(arr,0));
    }
}
