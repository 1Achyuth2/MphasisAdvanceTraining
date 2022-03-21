import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) throws IOException { 
	    Scanner s=new Scanner(System.in); 
	    FileReader a = null; 
	    FileWriter n = null; 
	    try { 
	        String file1=args[0]; 
	        a = new FileReader(file1); 
	        String file2=args[1];

	        File f2=new File(file2); 
	        if(!f2.exists()) { 
	            n = new FileWriter(file2); 
	            f2.createNewFile(); 
	            int c = a.read(); 
	            while(c!=-1) { 
	                n.write(c); 
	                c = a.read(); 
	            } 
	            a.close();
	            System.out.println("File copied successfully"); 
	        } else { 

	            System.out.println("Do you want to overwrite? enter 'yes' or 'no'...:"); 
	            char ans = s.next().charAt(0);

	            if(ans=='N'||ans=='n') { 
	                a.close();
	            //  fw.close();
	                System.out.println("Could not enter data"); 
	            } else { 
	                  n = new FileWriter(file2); 
	                int c = a.read(); 
	                while(c!=-1) { 
	                    n.write(c); 
	                    c =a.read(); 
	                } 
	                a.close();
	                System.out.println("File updated successfully"); 
	            } 
	        } 
	    } catch(IOException e) { 
	        System.out.println("File coudn't be found!!!"); 
	    } finally { 
	        close(a); 
	        close(n); 
	    } 
	} 
	public static void close(Closeable stream) { 
	    try { 
	        if (stream != null) { 
	            stream.close(); 
	        } 
	    } catch(IOException e) {
	        e.printStackTrace();
	        } 
	    }
}
