public class Test1 {
    public static void main(String[] args) {
        // Task 1 - Проверить, находится ли слово из переменной word в строке из переменной text
        String text = "application hello template";
        String word = "hello";
        // 1) realization with contains
        System.out.println(text.contains(word));
        // 2) realization with indexOf
        System.out.println(text.indexOf(word));

        // Task 2 - Из массива names вывести только те имена которые начинаются на символ `A`
        String[] names = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };
        // 1) realization with startsWith
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        // 2) realization with indexOf
        for (String name : names) {
            if (name.indexOf("A") == 0) {
                System.out.println(name);
            }
        }
        // 3) realization with charAt
        for (String name : names) {
            String n = String.valueOf(name.charAt(0));
            if (n.equals("A")) {
                System.out.println(name);
            }
        }

        // Task 3 - Вывести первое и последнее слово из строки text
        // Слова в строке text должны быть разделены одним пробелом
        // 1) Realization with substring and indexOf
        String text5 = "application hello transaction template";
        System.out.println(text5.substring(0, 11));
        System.out.println(text5.substring(text5.indexOf("te")));
        // 2) Realization with for and charAt
        String[] words2 = text5.split(" ");
        for (int i = 0; i < words2.length; i++) {
            if (i == 0 || i == words2.length - 1) {
                System.out.println(words2[i]);
            }
        }

        // Task 4 - Определить сколько раз слово из word встречается в text
        String text6 = "application hello template";
        String word3 = "hello";

        String[] array = text6.split(" ");
        int c = 0;

        for (String a : array) {
            if (a.equals(word3)) {
                c++;
            }
        }
        System.out.println("The word " + word3 + " appears " + c + " times");

        // Task 5 - Заменить буквы из переменной word в строке text на звёздочки (*)
        String text7 = "application hello template hello translate";
        String word4 = "hello";

        String[] array2 = text7.split(" ");
        int count2 = 0;
        for (String a : array2) {
            if (a.equals(word4)) {
                count2++;
                text7 = text7.replace("hello", "*");
            }
        }
        System.out.println(text7);
    }
}
