package ArrayPackage;

import javax.swing.plaf.basic.BasicArrowButton;

class count{
    int num(){
        int arr[]=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=1;
        arr[3]=1;
        int x=1;
        int countno=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                countno=countno+1;
            }
        }
        //System.out.println("The number of element present is :" +countno);
        return  countno;
    }
}
public class countNumber {
    public static void main(String[] args) {
       count obj=new count();
       obj.num();
        System.out.println();
    }
}
