import java.util.Scanner;

public class ArithmeticOperations {
    public int num1, num2;

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
        ArithmeticOperations op = new ArithmeticOperations(); // this is an object creation using a constructor
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from keyboard
        System.out.println("Enter the first number: ");
        op.num1 = sc.nextInt(); // // Reading first number and storing it in instance variable
        System.out.println("Enter the second number: ");
        op.num2 = sc.nextInt();
        int sum = op.addNums(op.num1, op.num2);
        int sub = op.subNums(op.num1, op.num2);
        int multiply = op.mulNums(op.num1, op.num2);
        float divide = op.divideNums(op.num1, op.num2);
        int mod = op.calcMod(op.num1, op.num2);
        System.out.println("Sum : " + sum +
                "  Difference : " + sub +
                "  Multiply : " + multiply +
                "  Division : " + divide +
                "  Modulus : " + mod);
    }
}