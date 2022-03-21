package Employee;

import java.util.Vector;

public class EmployeeCollection{
public static void main(String[] args) {
	Vector<EmployeeClass> v = addInput();
	display(v);
}

private static Vector<EmployeeClass> addInput() {
	// TODO Auto-generated method stub
	EmployeeClass e1 = new EmployeeClass(350,"Rohit","Hyderabad") ;
	EmployeeClass e2 = new EmployeeClass(351,"Venkat","Bangalore") ;
	EmployeeClass e3 = new EmployeeClass(352,"Niraj","Chennai") ;
	Vector<EmployeeClass> v = new Vector<EmployeeClass>();
	v .add(e1);
	v.add(e2);
	v.add(e3);
	return v;
}

private static void display(Vector<EmployeeClass> v) {
	// TODO Auto-generated method stub
	for(EmployeeClass e:v)
	{
		System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
	}
}
}
