// Employee.java

public abstract class Employee {
    protected String name;
    protected String PANNo;
    protected String joiningDate;
    protected String designation;
    protected int empId;

    // Constructor
    public Employee(String name, String PANNo, String joiningDate, String designation, int empId) {
        this.name = name;
        this.PANNo = PANNo;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.empId = empId;
    }

    // Abstract method
    public abstract double calcCTC();

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("PAN No: " + PANNo);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Designation: " + designation);
        System.out.println("Employee ID: " + empId);
    }
}
