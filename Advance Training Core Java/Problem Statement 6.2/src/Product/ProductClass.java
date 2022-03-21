package Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//import javax.print.attribute.HashAttributeSet;

public class ProductClass {
	public String productId;
	public String productName;
	public ProductClass(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "ProductClass [productId=" + productId + ", productName=" + productName + "]";
	}
    
	
	
	public static void main(String[] args) {
		HashSet<ProductClass> h=new HashSet<ProductClass>();
		h.add(new ProductClass("P001","Maruti 800"));
		h.add(new ProductClass("P002","Maruti Zen"));
		h.add(new ProductClass("P003","Maruti Dezire"));
		h.add(new ProductClass("P004","Maruti Alto"));
		
		System.out.println("the product list is:");
		System.out.println(h);
		System.out.println("enter the product id to be removed:");
		Scanner s=new Scanner(System.in);
		String id = s.next();
		h.remove(id);
		System.out.println("item removed");
		System.out.println("the product list is:");
		System.out.println(h.toString());
		System.out.println("enter the product id to be searched:");
		String id1=s.next();
		if(h.contains(id1))
		{
			System.out.println(h.toString());
		}
		else {
			System.out.println("do not exist");
		}
	}

	
}
