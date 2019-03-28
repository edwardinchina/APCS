package JavaBasics;

public class Manager extends Employee{
	
	
	Employee[] employees = new Employee[100];
	private int count;
	
	public Manager(String firstName, String lastName, int salary)
	{
		super(firstName, lastName, salary);
		
	}

	private void addEmployee(Employee employee) {
		employees[count]=employee;
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager ("Boss","Man",1000000);
		m.addEmployee(new Employee("Little","Guy",10));
		m.addEmployee(new Employee("Loyal","Worker",22));
		m.addEmployee(new Employee("Lazy","Worker",22));
		
		m.giveEmployeesRaises(5.0);
		System.out.println(m.salary);
		System.out.println(m.employees[0].salary);
	}

	private void giveEmployeesRaises(double r) {
		for(int i=0; i<count; i++) {
			employees[i].giveRaise(r);
		}
	}
	
	public void fireEmployee(Employee e)
	{
		int i = 0;
		for(i=0; i<count; i++) {
			if(employees[i] == e)
			{
				//remove
			}
		}			
		for(; i<count; i++) {
			//move employee
		}		
		//update Employee Count
	}
}
