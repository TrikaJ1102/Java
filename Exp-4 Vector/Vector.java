public class Vector {

    private double[] components;

    // Constructor
    public Vector(double[] components) throws VectorException {

        if (components.length != 2 && components.length != 3) {
            throw new VectorException("inputerror");
        }

        this.components = components;
    }

    // Method to check dimension match
    private void checkDimension(Vector v) throws VectorException {
        if (this.components.length != v.components.length) {
            throw new VectorException("dimensionmismatcherror");
        }
    }

    // Add method
    public Vector add(Vector v) throws VectorException {
        checkDimension(v);

        double[] result = new double[this.components.length];

        for (int i = 0; i < components.length; i++) {
            result[i] = this.components[i] + v.components[i];
        }

        return new Vector(result);
    }

    // Subtract method
    public Vector subtract(Vector v) throws VectorException {
        checkDimension(v);

        double[] result = new double[this.components.length];

        for (int i = 0; i < components.length; i++) {
            result[i] = this.components[i] - v.components[i];
        }

        return new Vector(result);
    }

    // Dot Product method
    public double dotProduct(Vector v) throws VectorException {
        checkDimension(v);

        double sum = 0;

        for (int i = 0; i < components.length; i++) {
            sum += this.components[i] * v.components[i];
        }

        return sum;
    }

    // Display method
    public void display() {
        System.out.print("Vector: (");
        for (int i = 0; i < components.length; i++) {
            System.out.print(components[i]);
            if (i != components.length - 1)
                System.out.print(", ");
        }
        System.out.println(")");
    }
}