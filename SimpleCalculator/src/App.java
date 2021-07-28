import java.util.Scanner;

public class App {
    private static double[] getOperands() {
        System.out.println("Choose two operands");
        System.out.print("Operand 1: ");
        Scanner scanner = new Scanner(System.in);
        double op1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Operand 2: ");
        double op2 = scanner.nextDouble();
        return new double[]{op1, op2};
    }
    public static void main(String[] args) {
        boolean shouldContinue = true;
        SimpleCalculator calculator = new SimpleCalculator();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1) +");
            System.out.println("2) -");
            System.out.println("3) *");
            System.out.println("4) /");
            System.out.println("5) Exit");
            System.out.print("Choose an option: ");
            int operator = scanner.nextInt();
            switch(operator) {
                case 1:
                    double[] operands = getOperands();
                    System.out.println(String.format("%.2f + %.2f = %.2f", operands[0], operands[1], calculator.add(operands[0], operands[1])));
                    break;
                case 2:
                    operands = getOperands();
                    System.out.println(String.format("%.2f - %.2f = %.2f", operands[0], operands[1], calculator.subtract(operands[0], operands[1])));
                    break;
                case 3:
                    operands = getOperands();
                    System.out.println(String.format("%.2f * %.2f = %.2f", operands[0], operands[1], calculator.multiply(operands[0], operands[1])));
                    break;
                case 4:
                    operands = getOperands();
                    System.out.println(String.format("%.2f / %.2f = %.2f", operands[0], operands[1], calculator.divide(operands[0], operands[1])));
                    break;
                case 5:
                    shouldContinue = false;
                    break;
            }
        }
        while(shouldContinue);
        System.out.println("Thanks for using the Simple Calculator!");
    }
}
