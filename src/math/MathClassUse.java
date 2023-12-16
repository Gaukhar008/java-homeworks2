import java.math.BigInteger;
import java.util.Arrays;

public class MathClassUse {
    // 1 task
    // Легкий уровень
    public void makeRound(double number) {
        System.out.println("Round number: " + Math.round(number));
    }

    // 2 task
    public void findMinAndMax(int a, int b) {
        System.out.println("Max number: " + Math.max(a, b));
        System.out.println("Min number: " + Math.min(a, b));
    }

    // 3 task
    public void findSqrt(double number) {
        System.out.println("Square root of " + number + " is " + Math.sqrt(number));
    }

    // 4 task
    public void exponent(double a, double b) {
        System.out.println("Exponent value is " + Math.pow(a, b));
    }

    // 5 task
    public void findPerimeterOfCircle(double radius) {
        System.out.println("Perimeter of circle is " + 2 * Math.PI * radius);
    }
    public void findNaturalLog(double number) {
        System.out.println("Natural logarithm of " + number + " is " + Math.log(number));
    }

    // Средний уровень

    // 1 task
    public void findLengthOfHypotenuse(double a, double b) {
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Length of Hypotenuse is " + h);
    }

    // 2 task
    public void convertDegreesToRadians(double degree) {
        double radian = (Math.PI / 180) * degree;
        System.out.println("Degree " + degree + " is " + radian + " radian");
    }
    public void convertRadiansToDegrees(double radian) {
        double degree = (180 / Math.PI) * radian;
        System.out.println("Radian " + radian + " is " + degree + " degree");
    }

    // 3 task
    public void findAreaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2; // perimeter
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("The area of triangle is " + area + " square meters");
    }

    // 4 task
    public void calculateLogarithms(double number) {
        System.out.println("Logarithm to base 10 of " + number + " is " + Math.log10(number));
        System.out.println("Natural logarithm of " + number + " is " + Math.log(number));
    }

    // 5 task
    // Вычисляем синус, косинус и тангенс прямоугольного треугольника
    // C - прямой угол
    public void calculateSinCosTan(double AC, double BC) {
        double AB = Math.sqrt(Math.pow(AC, 2) + Math.pow(BC, 2)); // hypotenuse
        double sinBAC = BC / AB;
        double cosBAC = AC / AB;
        double tgBAC = sinBAC / cosBAC;

        System.out.println("Sin of BAC is " + sinBAC + ", cos of BAC is " + cosBAC + ", tg of BAC is " + tgBAC);
    }

    // Сложный уровень
    // 1 task
    public void solveQuadraticEquation(double a, double b, double c) {
        System.out.println("We are solving the following quadratic equation: ax^2 + bx + c = 0");
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (- b - Math.sqrt(D)) / (2 * a);
            x2 = (- b + Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of equation: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = (- b) / (2 * a);
            System.out.println("The equation has only 1 root: x = " + x);
        } else {
            System.out.println("Equation does not have roots");
        }
    }

    // 2 task
    public void calculateDistanceBetWeen2PointsOnAPlane(double xa, double ya, double xb, double yb) {
        System.out.println("Formula for calculating the distance between two points A(xa, ya) and B(xb, yb) " +
                "on a plane is AB = √(xb - xa)^2 + (yb - ya)^2");
        double AB = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
        System.out.println("The distance between A and B is " + AB);
    }

    // 3 task
    public void calculateFactorial(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + a + " is " + factorial);
    }

    // 4 task
    public void sortByMin(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) { // i = 0
            int min = arrayOfNumbers[i]; // 2
            int minID = i; // 0
            for (int j = i + 1; j < arrayOfNumbers.length; j++) { // j = 1
                if (Math.min(arrayOfNumbers[j], min) == arrayOfNumbers[j]) {
                    min = arrayOfNumbers[j]; // 1
                    minID = j; // 1
                }
            }
            int temp = arrayOfNumbers[i];
            arrayOfNumbers[i] = min;
            arrayOfNumbers[minID] = temp;
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }

    // 5 task
    public void calculateTotalDepositWithCompoundInterest(double initialAmount, double interest, double months) {
        double finalAmount = initialAmount * Math.pow((1 + (interest / 100) / 12), months);
        System.out.println("The total amount of deposit with interest is " + finalAmount);
        System.out.println("The amount of interest is " + (finalAmount -initialAmount));
    }


}
