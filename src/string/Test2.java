public class Test2 {
    public static void main(String[] args) {
        // Task 1 - Напишите программу, которая принимает строку и
        // выводит каждое второе слово в этой строке.
        String text3 = "Java is a widely used programming language";
        String[] words = text3.split(" ");
        for (int i = 1; i < words.length; i += 2) {
            System.out.println(words[i]);
        }

        // Task 2 - Напишите программу, которая принимает строку и слово, а затем определяет,
        // сколько раз слово встречается в строке, игнорируя регистр букв.
        String text4 = "Java and JavaScript are not the same, but both are programming languages";
        String word1 = "java";

        String[] words1 = text4.toLowerCase().split(" ");
        int count = 0;

        for (String word2 : words1) {
            if (word2.equals(word1.toLowerCase())) {
                count++;
            }
        }
        System.out.println("The word " + word1 + " appears " + count + " times");

        // Task 3 - Напишите программу, которая инвертирует порядок слов в предложении.
        String text2 = "Java is fun to learn";
        String[] words3 = text2.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words3.length - 1; i >= 0; i--) {
            reversed.append(words3[i] + (i > 0 ? " " : ""));
        }

        System.out.println(reversed);
    }
}
