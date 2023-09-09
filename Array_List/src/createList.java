import java.util.ArrayList;
import java.util.List;

public class createList {

    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();

        //add new element
         arr.add(1);// 1
         arr.add(2);//1 2
         arr.add(3);//1 2 3
         arr.add(4);//1 2 3 4

         //print element with for loop
        for (int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.s

        // print arraylist directly
        System.out.println(arr);

        // add element at any index [1 2 5 3 4]

        arr.add(3,5);
        System.out.println(arr);

        // modify a element in i index
        arr.set(3,10);
        System.out.println(arr);
        // remove element at index i
        arr.remove(3);
        System.out.println(arr);
    }
}
