public class Main_vector {

    public static void main(String[] args) {

        try {

            double[] a = { 1, 2 };
            double[] b = { 3, 4 };

            Vector v1 = new Vector(a);
            Vector v2 = new Vector(b);

            // Addition
            Vector sum = v1.add(v2);
            System.out.print("Addition Result: ");
            sum.display();

            // Subtraction
            Vector diff = v1.subtract(v2);
            System.out.print("Subtraction Result: ");
            diff.display();

            // Dot Product
            double dot = v1.dotProduct(v2);
            System.out.println("Dot Product Result: " + dot);

        } catch (VectorException e) {
            System.out.println(e.getMessage());
        }

        // Example of dimension mismatch error
        try {

            double[] c = { 1, 2, 3 };
            double[] d = { 4, 5 };

            Vector v3 = new Vector(c);
            Vector v4 = new Vector(d);

            Vector result = v3.add(v4);

        } catch (VectorException e) {
            System.out.println(e.getMessage());
        }

        // Example of invalid dimension error
        try {

            double[] e = { 1 }; // Invalid dimension
            Vector v5 = new Vector(e);

        } catch (VectorException ex) {
            System.out.println(ex.getMessage());
        }
    }
}