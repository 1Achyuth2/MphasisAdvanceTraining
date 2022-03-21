import java.util.Scanner;

public class Rectangle2 {
	int length; 
    int breadth; 
    int area; 
    int parameter;
    
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return breadth;
	}

	public void setWidth(int width) {
		this.breadth = breadth;
	}

	
    public Rectangle2()
    {
    	length = 1;
    	breadth= 1;
    }

   public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * breadth;
       
    }
 
     void  perimeterRectangle()
    {
    	 parameter = 2*(length + breadth);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " +parameter);}
       
        }

    public static void main(String args[]) {
    	
        Rectangle2 o = new Rectangle2();
        o.input();
        o.areaRectangle();
        o.perimeterRectangle();
        o.display();
        System.out.println(" ");
        Rectangle2 o1 = new Rectangle2();
        o1.input();
        o1.areaRectangle();
        o1.perimeterRectangle();
        o1.display();
        System.out.println(" ");
        Rectangle2 o2 = new Rectangle2();
        o2.input();
        o2.areaRectangle();
        o2.perimeterRectangle();
        o2.display();
        System.out.println(" ");
        Rectangle2 o3 = new Rectangle2();
        o3.input();
        o3.areaRectangle();
        o3.perimeterRectangle();
        o3.display();
        System.out.println(" ");
        Rectangle2 o4 = new Rectangle2();
        o4.input();
        o4.areaRectangle();
        o4.perimeterRectangle();
        o4.display();	
    }
}
