import java.util.Scanner;

public class TwoInts {
    private double a, b;

    public TwoInts(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String sum() {
        return ("Sum: " + (a + b) + " ");
    }

    public String difference() {
        return ("Difference: " + (a - b) + " ");
    }

    public String product() {
        return ("Product: " + (a * b) + " ");
    }

    public String quotient() {
        return ("Quotient: " + (a / b));
    }

    public String larger() {
        if (a > b) {
            return (a + " is larger");
        } else if (a < b) {
            return (b + " is larger");
        } else {
            return ("Numbers are equal");
        }
    }

    public String isEven() {
        double x = a + b;
        if ((int) x == x) {
            if (x % 2 == 0) {
                return ("Sum is even");
            } else {
                return ("Sum is odd");
            }
        } else {
            return ("Sum is decimal (neither even nor odd)");
        }
    }
    public boolean isMultiple() {
        if(a % b == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}