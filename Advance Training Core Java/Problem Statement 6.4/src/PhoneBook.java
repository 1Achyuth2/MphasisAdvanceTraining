import java.util.Scanner;

public class PhoneBook {
	public static String help_msg=	"Press:   -  A  Add contact  -  S  Search  - Q  Exit :";
	public static void main(String[] args) {		
		System.out.println("        Welcome to Phone Book \n");
		Scanner s=new Scanner(System.in);		
		for(;;){
				System.out.print(help_msg+"\n:");
				String com=s.nextLine().trim();				
				
				if (com.equalsIgnoreCase("A")){
					System.out.print("Type in contact details in the format: name,lastname,phone\n:");
 
				}else if (com.equalsIgnoreCase("S")){
					System.out.print("Type in the name you are searching for :\n:");
 
				}else if (com.equalsIgnoreCase("Q")){
					System.out.println("Good Bye User....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}
 
}
