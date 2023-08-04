package ArrayPackage;
class length{
    void demoArray(){
        int arr[]=new int[4];
        //{1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=13;
        arr[3]=14;
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
public class length_of_array {
    public static void main(String[] args) {
        length obj=new length();
        obj.demoArray();

    }
}
