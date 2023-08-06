package ArrayProblem;

class Unique{
    void UniqueElement(){
        int arr[]=new int[7];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=3;
        arr[5]=2;
        arr[6]=1;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] >0){
                ans=arr[i];
            }
        }
        System.out.println();
        System.out.println("The unique element is :"+ans);
    }
}

public class searchUniqueElement {
    public static void main(String[] args) {
        Unique obj=new Unique();
        obj.UniqueElement();

    }
}
