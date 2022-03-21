
public class MathematicalExpression {
	public static void main(String[] args) {
		
		
		String num= (" 23  +  45  -  (  343  /  12  ) ");
		String[] str=num.split("\s");
		
		for(String str1:str){  
			System.out.println(str1); 
		}
}
}