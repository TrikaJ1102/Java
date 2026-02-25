public class MainForVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Honda", 200000, 4);
        Vehicle v3 = new Vehicle("Maruti", "X Cross", 200000, 'A', 'P');

        Vehicle v4 = v3;
        v4.auto = 'Y';
        v4.setMfgCode("TRKIA3476");
        v4.color = "PINKKK";

        Vehicle[] myFleet = { v1, v2, v3, v4 };
        // Vehicle[] newfleet ={v1, v3, v4};
        // int[] even = new int[] {1,2,3};

        float[] mileage = new float[4];

        mileage[0] = v1.calcMileage(1800, 100);
        mileage[1] = v2.calcMileage(2200, 120);
        mileage[2] = v3.calcMileage(1900, 98);
        mileage[3] = v4.calcMileage(2000, 111);

        printTable(myFleet, mileage);

        // Normal flow
        for (Vehicle v : myFleet) {
            print(v);
            v.start();
            v.drive();
            v.stop();
        }
        // v1.start();
        // v1.drive();
        // System.out.println("New speed: " + v1.changeSpeed(40));
        // System.out.println("Mileage: " + v1.calcMileage(45.0f, 10.98f));
        // v1.stop();

        // System.out.println();

        // v2.start();
        // v2.drive();
        // System.out.println("New speed: " + v2.changeSpeed(20));
        // System.out.println("Mileage: " + v2.calcMileage(45.0f, 10.98f));
        // v2.stop();
        //
    }

    // Prints individual vehicle details
    public static void print(Vehicle v) {
        System.out.println("=========== Vehicle Details ===========");
        System.out.println("Brand Name: " + v.brandName);
        System.out.println("Model Name: " + v.modelName);
        System.out.println("Colour: " + v.color);
        System.out.println("Manufacturing Code: " + v.getMfgCode());
        System.out.println("Price: " + v.price);
        System.out.println();
    }

    // Prints table (FIXED)
    public static void printTable(Vehicle[] fleet, float[] mileage) {

        System.out.println("--------------------------------------------------------------");
        System.out.println("Brand\t\tModel\t\tPrice\t\tMileage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            Vehicle v = fleet[i];
            System.out.println(
                    v.brandName + "\t\t" +
                            v.modelName + "\t\t" +
                            v.price + "\t\t" +
                            mileage[i]);
        }

        System.out.println("--------------------------------------------------------------");
    }
}