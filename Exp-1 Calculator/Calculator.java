import java.util.Scanner;

public class Calculator {
    public int num1, num2;
    public int operation;

    public int addNums(int n1, int n2) { // these are member method
        return n1 + n2;
    }

    public int subNums(int n1, int n2) {
        return n1 - n2;
    }

    public int mulNums(int n1, int n2) {
        return n1 * n2;
    }

    public float divideNums(int n1, int n2) {
        return (float) n1 / n2; // Type casting is used to get decimal result
    }

    public int calcMod(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println(
                    "Choose the arithmetic operation:  1. Addition, 2.Substraction, 3.Multiplication, 4.Division, 5.Modulus");
            cal.operation = sc.nextInt();

            if (cal.operation == 0) {
                System.out.println("Exiting...");
                running = false;
                break;
            }

            System.out.println("Enter the first number: ");
            cal.num1 = sc.nextInt(); // Reading first number and storing it in instance variable
            System.out.println("Enter the second number: ");
            cal.num2 = sc.nextInt();

            switch (cal.operation) {

                case 1:
                    System.out.println("Sum: " + cal.addNums(cal.num1, cal.num2));
                    break;
                case 2:
                    System.out.println("Sub: " + cal.subNums(cal.num1, cal.num2));
                    break;
                case 3:
                    System.out.println("Multiply: " + cal.mulNums(cal.num1, cal.num2));
                    break;
                case 4:
                    System.out.println("Division: " + cal.divideNums(cal.num1, cal.num2));
                    break;
                case 5:
                    System.out.println("Modulus: " + cal.calcMod(cal.num1, cal.num2));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
