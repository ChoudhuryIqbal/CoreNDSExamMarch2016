package oop.design;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1=new EmployeeInfo("Shakib",75);
		employee1.assignDepartment("Reporter");
		employee1.vacation=true;
		employee1.yearsWorked(2);
		employee1.calculateSalary();
		employee1.employeeId();
		employee1.employeeName();

		
		
		
		
		
		
		

	}

}
