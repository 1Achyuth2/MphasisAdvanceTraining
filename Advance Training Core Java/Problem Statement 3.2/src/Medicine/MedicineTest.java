package Medicine;

public class MedicineTest {
	public static void main(String[] args) 
	{
	MedicineInfo b[] = new MedicineInfo[5];
	double d = Math.random()*4;
	int a = (int) d;
	System.out.println(a);
	switch(a)
	{
	case 1: b[0] = new MedicineInfo();

	b[1] = new Tablet();
	b[0].display();
	b[1].display();
	break;
	case 2: b[2] = new MedicineInfo();
	b[3] = new Syrup();
	b[2].display();
	b[3].display();
	break;
	case 3: b[4] = new MedicineInfo();
	b[5] = new Ointment();
	b[4].display();
	b[5].display();
	break;
	default: System.out.println("Invalid Option");
	}
	}
}
