package BookClass;

public class MainMethods {
public void createBook() {
	Book b[] = new Book[4];		 
    b[0] = new Book("Java Programing", 350);
    b[1] = new Book("C", 200);
    b[2] = new Book("C++", 250);
    b[3] = new Book("Python", 300);
    for(int i = 0; i<b.length; i++) {
	         b[i].display();
    }
}
public void showBooks() {
  	createBook();
}
public static void main(String args[])  {
    MainMethods c1 = new MainMethods();  
	c1.showBooks();
   
      }
}
