package BasedProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Student1 {

    public static void main(String args[])throws Exception
    {
         BufferedReader b=new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Enter roll number: ");
         int roll = Integer.parseInt(b.readLine());
         System.out.print("\nEnter name: ");
         String name = b.readLine();
         System.out.print("\nEnter age: ");
         int age = Integer.parseInt(b.readLine());
         System.out.print("\nEnter course: ");
         String course = b.readLine();
         Student s = new Student(roll,name,age,course);
         s.display();
    }
}
