import java.util.Scanner;

class Example14 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter first number:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        int y;
        System.out.println("Enter second number:");
        
        y = inputValue.nextInt();

        int z;
        System.out.println("Enter third number");

        z = inputValue.nextInt();

        if (x <= y && y <= z) {
            System.out.println("Order is: " + x + " , " + y + " and " + z);
        } else if (x <= z && z <= y) {
            System.out.println("Order is: " + x + " , " + z + " and " + y);
        } else if (y <= x && x <= z) {
            System.out.println("Order is: " + y + " , " + x + " and " + z);
        } else if (y <= z && z <= x) {
            System.out.println("Order is: " + y + " , " + z + " and " + x);
        } else if (z <= x && x <= y) {
            System.out.println("Order is: " + z + " , " + x + " and " + y);
        } else {
            System.out.println("Order is: " + z + " , " + y + " and " + x);
        }
    }
}
