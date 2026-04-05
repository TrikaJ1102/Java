// Main.java

public class Main {
    public static void main(String[] args) {

        // Full Time Employee (SWE)
        FullTimeEmployee emp1 = new FullTimeEmployee(
                "Rahul", "ABCDE1234F", "01-01-2023",
                "Engineer", 101,
                50000, 10000, 5000, "SWE");

        emp1.displayDetails();
        System.out.println("CTC: " + emp1.calcCTC());
        System.out.println();

        // Full Time Employee (HR)
        FullTimeEmployee emp2 = new FullTimeEmployee(
                "Anita", "XYZAB5678K", "15-03-2022",
                "HR", 102,
                40000, 8000, 7000, "HR");

        emp2.displayDetails();
        System.out.println("CTC: " + emp2.calcCTC());
        System.out.println();

        // Contract Employee
        ContractEmployee emp3 = new ContractEmployee(
                "Ravi", "LMNOP9876Q", "10-06-2023",
                "Consultant", 103,
                120, 500);

        emp3.displayDetails();
        System.out.println("CTC: " + emp3.calcCTC());
        System.out.println();

        // Manager
        Manager mgr = new Manager(
                "Priya", "AAAAA1111A", "05-05-2021",
                "Manager", 104,
                70000, 15000, 0, "SWE",
                5000, 3000);

        mgr.displayDetails();
        System.out.println("CTC: " + mgr.calcCTC());
    }
}