package Employee;

class Employee1
{
	String Name;
	int emp_id;
	float basic_salary;
	float sa;
	float hra;
	float da;
	
	Employee1(String name, int emp,float basic_salary,  float sa, float hra, float da)
	{
		Name = name;
		emp = emp_id;
		this.basic_salary = basic_salary;
		this.sa = sa ;
		this.hra = hra;
		this.da = da;
	}
	
	void calculateSalary()
	{
		double Salary;
		Salary = basic_salary + sa + hra + da;
		System.out.println("Salary of Employee before Managers Increment  - "+Salary);
	}
}

class Manager extends Employee1
{

	Manager(String name, int emp, float basic_salary, float sa, float hra, float da) {
		super(name, emp, basic_salary, sa, hra, da);
		// TODO Auto-generated constructor stub
		double Salary;
		Salary = basic_salary + 2*sa + hra + da;
		System.out.println("Salary of Employee After Managers Increment  - "+Salary); 
	}
}

class ProjectManager extends Manager
{

	ProjectManager(String name, int emp, float basic_salary, float sa, float hra, float da) {
		super(name, emp, basic_salary, sa, hra, da);
		// TODO Auto-generated constructor stub
		double Salary;
		Salary = basic_salary + 2*sa + 2*hra + da;
		System.out.println("Salary of Employee After Product Manager's Increment - "+Salary); 
	}
	
}
public class Salary {
	public static void main(String[] args) {
		ProjectManager pm  = new ProjectManager("Pranit", 101, 1000, 2000, 3000, 4000);
		pm.calculateSalary();
	}
}
