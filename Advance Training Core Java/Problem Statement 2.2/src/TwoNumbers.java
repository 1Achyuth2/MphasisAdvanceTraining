import java.util.Scanner;

public class TwoNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	int a=s.nextInt();
	System.out.println("enter second number");
	int b=s.nextInt();
	int count=0;
	System.out.print(a+" "+b);

	for(int i=0;i<13;i++) {
		count=a+b;
		System.out.print(" "+count);
		a=b;
		b=count;
		
	}
}
}
