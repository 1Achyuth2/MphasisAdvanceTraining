
import java.lang.Runnable;

class Storage

{

	private int a;

	public Storage(int X) {
		a = X;
	}

	public int GetX() {
		return (a);
	}

	public Storage(Storage s) {
		this.a = s.GetX();
	}

}

class Printer implements Runnable

{

	private Storage stor;

	Printer(Storage s) {
		stor = new Storage(s);
	}

	public void run()

	{

		System.out.println(stor.GetX());

	}

}

class Counter implements Runnable

{

	private int N;

	public Counter(int n) {
		N = n;
	}

	public int GetN() {
		return (N);
	}

	public void run()

	{

		for (int i= 1; i <= N; i++)

		{

			Storage s= new Storage(i);

			Printer p = new Printer(s);

			Thread.yield();

			p.run();

		}

	}

}

class ThreadCounter

{

	public static void main(String args[])

	{

		Counter counter = new Counter(25);

		counter.run();

	}

}