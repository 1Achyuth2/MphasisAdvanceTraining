package BookClass;

public class Book {
private String book_title;
private int book_price;

public void setTitle(String book_title) {
	this.book_title=book_title;
}
public String getTitle() {
	return book_title;
}
public void setPrice(int book_price) {
	this.book_title=book_title;
}
public int getPrice() {
	return book_price;
}

public Book(String book_title, int book_price) {
	this.book_title = book_title;
	this.book_price = book_price;
}
public void display() {
	System.out.println("Book Title : "+book_title);
	System.out.println("Book Price : "+book_price);
}
}
