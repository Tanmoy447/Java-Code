class student{
    int rollno;
    String studentName;
}
public class creatingObject {
   // int age =20;
    public static void main(String[] args) {
        student obj1=new student();
        obj1.rollno=5;
        obj1.studentName="Tanmoy";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentName);
        student obj2=new student();
        obj2.rollno=10;
        obj2.studentName="Adhikary";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentName);
    }
}
