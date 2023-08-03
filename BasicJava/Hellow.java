class area
{
	int length,width;            //declaring variable
	
}
public class Hellow
{
	public static void main (String args[])
	{
		area myarea;
		myarea=new area();                     //creating reference to objects
		int vol;
		myarea.length=23;
		myarea.width=3;
		vol=myarea.length*myarea.width;
		System.out.println("Area of rectangle is :" +vol);
	}

}
 					