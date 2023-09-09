public class selectionSort {
    static void selection_sort(int[] arr){
        for (int i=0;i < arr.length-1; i++){
            int min_value=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min_value]){
                    min_value=j;
                }
            }
            int temp=arr[min_value];
            arr[min_value]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={12,2,3,4,34,44};
        selection_sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
