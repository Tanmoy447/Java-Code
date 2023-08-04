package ArrayPackage;
class sum{
    void add(){
        int sum=0;
        int arr[]=new int[4];
        //{1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
public class sumOfElements {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.add();
    }
}

