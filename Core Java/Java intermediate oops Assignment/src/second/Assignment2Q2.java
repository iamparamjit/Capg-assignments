package second;
import java.util.ArrayList;


public class Assignment2Q2 {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Manager m1=new Manager();
		Labour l1=new Labour();
		
		ArrayList <Integer> a=new ArrayList<>();
		a.add(m1.getSalary(10000));
		a.add(l1.getSalary(5000));
		
	
		System.out.println(e1.totalEmployeesSalary(a));
		
		

	}

}
