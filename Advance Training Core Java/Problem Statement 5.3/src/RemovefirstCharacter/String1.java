package RemovefirstCharacter;

public class String1 {
public static void main(String[] args) {
	int length=7;
	 String str="MPHASIS";
	 String c=str+str.substring(0,length-1);
	for(int i=0;i<=str.length()-1;i++) {
		String p=c.substring(i,i+length);
		System.out.println(p);
	}
}
}