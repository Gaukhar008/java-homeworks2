public class Animal {
    String name;

    public void sayHello() {
        System.out.println("Привет, " + this.name + "!");
    }

    public void sayEnjoyMeal() {
        System.out.println("Приятного аппетита, " + this.name + "!");
    }

    public double findMaxExpense(double[] feedExpenses) {
        double maxFeedExpense = 0;

        for (int i = 0; i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
        }

        return maxFeedExpense;
    }

    public double findExpensesSum(double[] feedExpenses) {
        double sumFeed = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            sumFeed = sumFeed + feedExpenses[i];
        }

        return sumFeed;
    }
}
