// FullTimeEmployee.java

public class FullTimeEmployee extends Employee {
    protected double baseSalary;
    protected double perfBonus;
    protected double hiringCommission;
    protected String role;

    public FullTimeEmployee(String name, String PANNo, String joiningDate,
            String designation, int empId,
            double baseSalary, double perfBonus,
            double hiringCommission, String role) {
        super(name, PANNo, joiningDate, designation, empId);
        this.baseSalary = baseSalary;
        this.perfBonus = perfBonus;
        this.hiringCommission = hiringCommission;
        this.role = role;
    }

    @Override
    public double calcCTC() {
        if (role.equalsIgnoreCase("SWE")) {
            return baseSalary + perfBonus;
        } else if (role.equalsIgnoreCase("HR")) {
            return baseSalary + hiringCommission;
        } else {
            return baseSalary;
        }
    }
}