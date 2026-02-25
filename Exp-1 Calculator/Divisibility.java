public class Divisibility{
    public static void main(String[] args){
        int num = 1;
        while (num<51){
            if (num % 2 == 0) {
                System.out.println(num + "  is divisible by 2");
            }
            if (num % 3 == 0) {
                System.out.println(num + "  is divisible by 3");
            }
            if (num % 5 == 0) {
                System.out.println(num + "  is divisible by 5");
            }
            num++;
        }

    }

}