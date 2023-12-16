public class Test {
    public static void main(String[] args) {
        MathClassUse first = new MathClassUse();
        first.makeRound(2.5);
        first.findMinAndMax(3,7);
        first.findSqrt(16);
        first.exponent(6, 2);
        first.findPerimeterOfCircle(5);
        first.findNaturalLog(7.39);
        first.findLengthOfHypotenuse(3, 4);
        first.convertDegreesToRadians(35);
        first.convertRadiansToDegrees(1);
        first.findAreaOfTriangle(3 , 4, 5);
        first.calculateLogarithms(8300);
        first.calculateSinCosTan(4, 3);
        first.solveQuadraticEquation(1, -6, 9);
        first.calculateDistanceBetWeen2PointsOnAPlane(-1, 3, 6,2);
        first.calculateFactorial(5);
        first.sortByMin(new int[]{2, 1, 5, 3, 4, 6});
        first.calculateTotalDepositWithCompoundInterest(350000, 4.7, 9);
    }
}
