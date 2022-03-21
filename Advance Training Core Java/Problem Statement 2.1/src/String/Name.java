package String;

import java.util.Scanner;

public class Name {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
	String a=s.next();
	Name n=new Name();
	n.name(a);
}
public void name(String a) {
	String g="";
	System.out.println(a.length());
	System.out.println(a.toUpperCase());
	for(int i=a.length()-1;i>=0;i--) {
		g=g+a.charAt(i);
	}
	if(g.equalsIgnoreCase(a)) {
		System.out.println("palandrome");
	}
	else {
		System.out.println("no");
	}
}
}
