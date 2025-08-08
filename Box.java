import java.util.*;
class Box
{
	int w,h,d;
	Box(int width,int height,int depth)
	{
		w=width;
		h=height;
		d=depth;
	}
	int volume()
	{
		return w*h*d;
	}
	
}
class abcd{
	public static void main(String[] args)
	{	
		System.out.println("enter w,h,d");
		w=sc.nextInt();
		h=sc.nextInt();
		d=sc.nextInt();
		Box b=new Box(w,h,d);
		System.out.println("volume "+b.volume());

	}
}