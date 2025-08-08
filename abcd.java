import java.util.*;
abstract class shape
{
	String color;
	abstract void calculateArea();
}

interface Resizable
{
	public void resize();
}

class circle extends shape implements Resizable{
	Scanner sc=new Scanner(System.in);
	
	
	void calculateArea()
	{
		System.out.println("Enter radius");
	int r=sc.nextInt();

		double area=3.14*r*r;
		System.out.println("Area"+area);
	}
	public void resize()
	{
		System.out.println("resize");
	}

}

class rectangle extends shape implements Resizable{
	Scanner sc=new Scanner(System.in);
	
	
	void calculateArea()
	{
		System.out.println("Enter l b");
	int l=sc.nextInt();
	int b=sc.nextInt();
		int area1=l*b;
		System.out.println("Area"+area1);
	}
	public void resize()
	{
		System.out.println("resize");
	}


}
class abcd{
	public static void main(String[] args)
	{	
		circle a=new circle();
		a.calculateArea();
		a.resize();
		rectangle r=new rectangle();
		r.calculateArea();
		r.resize();

	}
}