class Counter implements Runnable {

	Storage s;

	public Counter(Storage store) {
		s = store;
	}

	@Override
	public void run() {
		synchronized (s) {
			for (int i = 0; i < 10; i++) {
				while (!s.isPrinted()) { 
					try {
						s.wait();
					} catch (Exception e) {
					}
				}
				s.setValue(i);
				s.setPrinted(false);
				s.notify();
			}
		}
	}

}

class Printer implements Runnable {
	Storage n;

	public Printer(Storage n) {
		this.n = n;
	}

	@Override
	public void run() {
		synchronized (n) {
			for (int i = 0; i < 10; i++) {
				while (n.isPrinted()) { 
					try {
						n.wait();
					} catch (Exception e) {
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + n.getValue());
				n.setPrinted(true);
				n.notify();
			}
		}
	}

}

class Storage {
	int i;
	boolean printed = true;

	public void setValue(int i) {
		this.i = i;
	}

	public int getValue() {
		return this.i;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean p) {
		printed = p;
	}
}

public class Synchronization {
	public static void main(String[] args) {
		Storage st = new Storage();
		Counter c = new Counter(st);
		Printer p = new Printer(st);
		new Thread(c, "Counter").start();
		new Thread(p, "Printer").start(); 
	}

}

