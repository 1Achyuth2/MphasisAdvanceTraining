
public class ManipulateString {
public static void main(String[] args) {
	String str="JAVA is Simple";
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	String[] r=str.split("\\s");	
	for(String d:r){  
		System.out.print(d.charAt(0)); 
		System.out.print(" ");
	}
	System.out.println(" ");
	
	
	String[] r1=str.split("\\s"); 
	for(String h:r1){  
		System.out.println(h); 
	}
	
	
	StringBuilder inp= new StringBuilder("JAVA is Simple");
	
	Object o;
	System.out.println("String = " + inp.toString());
	StringBuilder reverseName= inp.reverse();
	System.out.println("Reverse Name = " + reverseName.toString());
	
	
	System.out.println("length of Name " + str.length());
}
}