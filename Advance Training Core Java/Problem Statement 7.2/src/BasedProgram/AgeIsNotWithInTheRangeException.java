package BasedProgram;

public class AgeIsNotWithInTheRangeException extends Exception{
	public String toString()
    {
         return ("Age is not between 15 and 21. please Retype the Age");
    }
}
