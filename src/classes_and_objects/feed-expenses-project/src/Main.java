// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        Cat cat1 = new Cat();
        cat1.name = "Пиксель";
        cat1.sayHello();
        System.out.println("Твой самый дорогой корм стоил " + cat1.findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + cat1.findExpensesSum(feedExpensesCat));
        cat1.sayEnjoyMeal();

        System.out.println(" ");

        Hamster hamster1 = new Hamster();
        hamster1.name = "Байт";
        hamster1.sayHello();
        System.out.println("Твой самый дорогой корм стоил " + hamster1.findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + hamster1.findExpensesSum(feedExpensesHamster));
        hamster1.sayEnjoyMeal();
    }
}