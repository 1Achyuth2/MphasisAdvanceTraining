package Rectangle;

public class Rectangle {
public int length;
public int breadth;

 public Rectangle(int length,int breadth) {
	 this.length=length;
	 this.breadth=breadth;
	}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}


public void calculateArea() {
	int a=length*breadth;
	System.out.println("Area of the Rectangular "+a);
}
}