package Internsavy;


    import java.util.Scanner;

    public class BasicCalculator implements Calculator {

        public void add(double x, double y) {
            double result = x + y;
            System.out.println(x + " + " + y + " = " + result);
        }

        public void subtract(double x, double y) {
            double result = x - y;
            System.out.println(x + " - " + y + " = " + result);
        }

        public void multiply(double x, double y) {
            double result = x * y;
            System.out.println(x + " * " + y + " = " + result);
        }

        public void divide(double x, double y) {
            if (y == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                double result = x / y;
                System.out.println(x + " / " + y + " = " + result);
            }
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            BasicCalculator calc = new BasicCalculator();

            System.out.println("---- Basic Calculator ----");
            System.out.print("Enter first number: ");
            double x = input.nextDouble();
            System.out.print("Enter second number: ");
            double y = input.nextDouble();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("\nEnter your choice (1-4): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    calc.add(x, y);
                    break;
                case 2:
                    calc.subtract(x, y);
                    break;
                case 3:
                    calc.multiply(x, y);
                    break;
                case 4:
                    calc.divide(x, y);
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        }
    }

