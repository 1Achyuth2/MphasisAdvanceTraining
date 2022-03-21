package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentName {
		 public static void main (String[] args) {
			 ArrayList<String> a1=new ArrayList<String>();
		 int a;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter  number for students:");
		 a=sc.nextInt();
		 System.out.println("enter student names:");
		for(int i=0;i<a;i++)
		{
			a1.add(sc.next());
		}
		System.out.println("student list:");
		for(String n:a1)
		{
				System.out.println("enter student Name to search:");
			    String str=sc.next(); 
			    int pos=Collections.binarySearch(a1,str);
				System.out.println("position of "+str+" is: "+pos);
				
				}
	}
}
