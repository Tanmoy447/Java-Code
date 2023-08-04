package ArrayPackage;
class max{
    void maxi(){
        int max=-1;
        int arr[]=new int[4];
        //{1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
public class maxElement {
    public static void main(String[] args) {
        max obj=new max();
        obj.maxi();

    }
}
