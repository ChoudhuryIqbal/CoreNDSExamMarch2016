package oop.design;

/**
 * Created by a on 4/11/16.
 */
public abstract class EmployeeAbstract implements Employee {
    public int id;
    public String name;
    public String department;
    private double totalSalary;
    public int workingYear;
    private double commision;
    private double baseSalary;
    public boolean healthInsurance,vacation;


    @Override
    public int employeeId() {
        return id;
    }

    @Override
    public String employeeName() {
        return name;
    }

    @Override
    public void assignDepartment() {
        System.out.println("This employee has not been assigned to any department");

    }
    //overloading
    public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public int calculateSalary() {
        return (int)(totalSalary+commision);
    }


    @Override
    public void benefitLayout() {
        System.out.println("insurance"+healthInsurance+" ,Vacation: "+vacation);

    }
    public abstract int yearsWorked(int years);
}
