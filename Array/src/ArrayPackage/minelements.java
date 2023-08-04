package ArrayPackage;
class minimum{
    void min(){

        int arr[]=new int[4];
        //{1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=0;
        arr[3]=4;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
public class minelements {
    public static void main(String[] args) {
        minimum obj=new minimum();
        obj.min();

    }
}
