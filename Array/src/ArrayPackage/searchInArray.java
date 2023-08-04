package ArrayPackage;
class search{
    void find(){
        int arr[]=new int[4];
        //{1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        int x=3;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                System.out.println("Found "+ x +" at index "+ans);
            }
      
        }
    }
}
public class searchInArray {
    public static void main(String[] args) {
        search obj=new search();
        obj.find();
    }
}





















































