public class Vehicle {
    public String brandName;
    public String modelName;
    public String color;
    public double price;
    private String mfgCode;
    public int seatingCapacity;
    public char fuelType;
    public char auto;

    public void setMfgCode(String mCode) {
        mfgCode = mCode;
    }

    public String getMfgCode() {
        return mfgCode;
    }

    public void start() {
        System.out.println("This vehicle has started.");
    }

    public void drive() {
        System.out.println("This vehicle can be driven on all surfaces");
    }

    public void stop() {
        System.out.println("Stop the ignition. you are at 0kmph now!");
    }

    public float changeSpeed(float sp) {
        float newSp;
        if (sp < 20)
            newSp = sp += 20;
        else
            newSp = sp -= 20;
        return newSp;
    }

    public float calcMileage(float dist, float fuel) {
        float mileage;
        mileage = dist / fuel;
        return mileage;

    }

    // normal constructor
    public Vehicle() {
        brandName = "Hyundai";
        modelName = "Getz";
        color = "Red";
        price = 200000;
        mfgCode = "XYZP4567";
        fuelType = 'P';
        auto = 'Y';
    }

    // parameterized constructor 1
    public Vehicle(String bName, String mName, double price, char auto, char fuelType) {
        this.brandName = bName;
        this.modelName = mName;
        this.price = price;
        this.auto = auto;
        this.fuelType = fuelType;
    }

    // parameterized constructor 2
    public Vehicle(String bName, double p, int s) {
        brandName = bName;
        price = p;
        seatingCapacity = s;
    }

    // COPY CONSTRUCTOR
    public Vehicle(Vehicle v) {
        brandName = v.brandName;
        modelName = v.modelName;
        color = v.color;
        fuelType = v.fuelType;
        auto = v.auto;
        price = v.price;
        seatingCapacity = v.seatingCapacity;
        mfgCode = v.getMfgCode();
    }

}
/*
 * public static void main (String[] args){
 * Vehicle v1 = new Vehicle();
 * v1.brandName = "Honda";
 * v1.modelName = "Accord";
 * v1.color = "Blue";
 * v1.mfgcode = "XYZ1234";
 * v1.price = 2500000.45;
 * 
 * Vehicle v2 = new Vehicle();
 * v2.brandName = "Maruti";
 * v2.modelName = "X cross";
 * v2.color = "Grey";
 * v2.mfgcode = "XYZ1122";
 * v2.price = 5000000.45;
 * 
 * print(v1);
 * print(v2);
 * v1.start();
 * v1.drive();
 * float newSp = v1.changeSpeed(40);
 * System.out.println("New speed:  " + newSp);
 * float mileage1 = v1.calcMileage(45.00f, 10.98f);
 * System.out.println("Mileage:  " + mileage1);
 * v1.stop();
 * 
 * v2.start();
 * v2.drive();
 * float newSp2 = v2.changeSpeed(20);
 * System.out.println("New speed:  " + newSp2);
 * float mileage2 = v2.calcMileage(45.00f, 10.98f);
 * System.out.println("Mileage:  " + mileage2);
 * v2.stop();
 * 
 * 
 * }
 * public static void print(Vehicle v)
 * {
 * System.out.println("=================== Vehicle details =================");
 * System.out.println("Brand Name: " + v.brandName);
 * System.out.println("Model Name: " + v.modelName);
 * System.out.println("Colour: " + v.color);
 * System.out.println("Manufacturing Code: " + v.mfgcode);
 * System.out.println("Price: " + v.price);
 * }
 * }
 */

/*
 * public class MainForVehicle {
 * 
 * public static void main(String[] args) {
 * 
 * Vehicle v1 = new Vehicle();
 * v1.brandName = "Honda";
 * v1.modelName = "Accord";
 * v1.color = "Blue";
 * v1.setMfgCode("XYZ1234");
 * v1.price = 2500000.45;
 * 
 * Vehicle v2 = new Vehicle();
 * v2.brandName = "Maruti";
 * v2.modelName = "X Cross";
 * v2.color = "Grey";
 * v2.setMfgCode("XYZ1122");
 * v2.price = 5000000.45;
 * 
 * print(v1);
 * print(v2);
 * 
 * v1.start();
 * v1.drive();
 * System.out.println("New speed: " + v1.changeSpeed(40));
 * System.out.println("Mileage: " + v1.calcMileage(45.0f, 10.98f));
 * v1.stop();
 * 
 * System.out.println();
 * 
 * v2.start();
 * v2.drive();
 * System.out.println("New speed: " + v2.changeSpeed(20));
 * System.out.println("Mileage: " + v2.calcMileage(45.0f, 10.98f));
 * v2.stop();
 * }
 * 
 * public static void print(Vehicle v) {
 * System.out.println("=========== Vehicle Details ===========");
 * System.out.println("Brand Name: " + v.brandName);
 * System.out.println("Model Name: " + v.modelName);
 * System.out.println("Colour: " + v.color);
 * System.out.println("Manufacturing Code: " + v.getMfgCode());
 * System.out.println("Price: " + v.price);
 * System.out.println();
 * }
 * }
 */

/*
 * public class MainForVehicle {
 * 
 * public static void main(String[] args) {
 * 
 * Vehicle v1 = new Vehicle();
 * print(v1);
 * System.out.println("Mileage for v1: " + v1.calcMileage(1800, 100));
 * 
 * Vehicle v2 = new Vehicle("Honda", 200000, 4);
 * print(v2);
 * System.out.println("Mileage for v2: " + v2.calcMileage(2200, 120));
 * 
 * Vehicle v3 = new Vehicle("Maruti", "X Cross", 200000, 'A', 'P');
 * print(v3);
 * System.out.println("Mileage for v3: " + v3.calcMileage(1900, 98));
 * 
 * Vehicle v4 = v3;
 * v4.auto = 'Y';
 * v4.setMfgCode("TRKIA3476");
 * v4.color = "PINKKK";
 * print(v4);
 * System.out.println("Mileage for v4: " + v4.calcMileage(2000, 111));
 * 
 * Vehicle[] myFleet = new Vehicle[] { v1, v2, v3, v4 };
 * // Vehicle[] newfleet ={v1, v3, v4};
 * // int[] even = new int[] {1,2,3};
 * 
 * for (Vehicle v : myFleet) {
 * print(v);
 * v.start();
 * v.drive();
 * v.stop();
 * }
 * // v1.start();
 * // v1.drive();
 * // System.out.println("New speed: " + v1.changeSpeed(40));
 * // System.out.println("Mileage: " + v1.calcMileage(45.0f, 10.98f));
 * // v1.stop();
 * 
 * // System.out.println();
 * 
 * // v2.start();
 * // v2.drive();
 * // System.out.println("New speed: " + v2.changeSpeed(20));
 * // System.out.println("Mileage: " + v2.calcMileage(45.0f, 10.98f));
 * // v2.stop();
 * //
 * }
 * 
 * public static void print(Vehicle v) {
 * System.out.println("=========== Vehicle Details ===========");
 * System.out.println("Brand Name: " + v.brandName);
 * System.out.println("Model Name: " + v.modelName);
 * System.out.println("Colour: " + v.color);
 * System.out.println("Manufacturing Code: " + v.getMfgCode());
 * System.out.println("Price: " + v.price);
 * System.out.println();
 * }
 * }
 */
