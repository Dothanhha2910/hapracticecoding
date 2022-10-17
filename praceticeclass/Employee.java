package praceticeclass;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFullName(Employee employee){
        return employee.getFirstName() + " " + employee.getLastName();
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    public String toString(){
        return "Employee" + this.firstName + " " + this.lastName + "with id: " + this.id + "has salary rate of " + "per month.";
    }
}
