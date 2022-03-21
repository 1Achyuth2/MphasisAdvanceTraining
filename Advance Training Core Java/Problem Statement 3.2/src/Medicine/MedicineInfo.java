package Medicine;

public class MedicineInfo {
	public void display(){
		System.out.println("Company :Apolo");
		System.out.println("Address :Vizag");
		}
	}
class Tablet extends MedicineInfo{
		 
		public void display(){
			System.out.println("store in a cool dry place");
			}
		}
class Syrup extends MedicineInfo{
	public void display(){
		System.out.println("it is very expensive");
		}
	}
class Ointment extends MedicineInfo{
	public void display(){
		System.out.println("for external use only");
		}
}
