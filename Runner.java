import java.util.Scanner;

public class Runner {
    private static double input1, input2;
    private static Scanner input;
    private static TwoInts twoInts;
    private static String sum, difference, product, quotient, larger, operationsPrint, comparePrint, isEven;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Type first number: ");
        input1 = input.nextDouble();
        System.out.println("Type Second number: ");
        input2 = input.nextDouble();
        twoInts = new TwoInts(input1, input2);
        sum = twoInts.sum();
        difference = twoInts.difference();
        product = twoInts.product();
        quotient = twoInts.quotient();
        larger = twoInts.larger();
        operationsPrint = new String(sum + difference + product + quotient);
        comparePrint = new String(larger);
        isEven = new String(twoInts.isEven());
        System.out.println(operationsPrint);
        System.out.println(comparePrint);
        System.out.println(isEven);
        if (twoInts.isMultiple()) {
            System.out.println(input1 + " is a multiple of " + input2);
        } else {
            System.out.println(twoInts.isMultiple());
            System.out.println(input1 + " is not a multiple of " + input2);
        }
    }
}