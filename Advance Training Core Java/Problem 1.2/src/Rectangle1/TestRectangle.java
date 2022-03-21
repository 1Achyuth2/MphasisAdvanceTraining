package Rectangle1;

import Rectangle.Rectangle;

public class TestRectangle{
	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,4);
		Rectangle r1=new Rectangle(5,4);
		Rectangle r2=new Rectangle(6,4);
		Rectangle r3=new Rectangle(7,4);
		Rectangle r4=new Rectangle(9,4);

		r.calculateArea();
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
		r4.calculateArea();
		
		System.out.println(r.length);
		System.out.println(r.breadth);
	}
}
