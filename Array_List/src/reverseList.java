import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class reverseList {

    static void reverse(List<Integer> list){

        int  i=0,j=list.size()-1;
        while (i<j){
            Integer temp= list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //add new element
        list.add(1);// 1
        list.add(3);//1 2
        list.add(2);//1 2 3
        list.add(4);//1 2 3 4
        list.add(5);
        list.add(7);
        list.add(12);
        list.add(8);
        System.out.println("Original list is : "+list);
//        reverse(list);
        Collections.reverse(list);
        System.out.println("Reversed list is : "+list);
        Collections.sort(list);
        System.out.println("Ascending order : "+list);
//        Collections.sort(list, List.re);
        list.sort(Collections.reverseOrder());
        System.out.println("Descending order : "+list);
    }
}
