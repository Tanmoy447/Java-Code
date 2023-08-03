
class factorial{
    public int fact(int n){
        if(n<=1)    return 1;
        int x=n*fact(n-1);
        return x;
    }
    
}
public class Method {
    
    public static void main(String[] args) {
        factorial obj=new factorial();
      //  obj.fact(5);
        System.out.println("The factorial is : "+obj.fact(5));
        System.out.println("The factorial is :"+obj.fact(4));
    }
    
}
