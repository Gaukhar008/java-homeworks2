public class Test3 {
    public static void main(String[] args) {

        // Task 1 - Напишите программу, которая принимает строку и сортирует слова в ней в порядке увеличения
        // их длины. В случае одинаковой длины слова должны быть отсортированы лексикографически.
        String text = "Java is a widely used programming language";
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length() ||
                        (words[i].length() == words[j].length() && words[i].compareTo(words[j]) > 0)) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        for (String word : words) {
            System.out.println(word);
        }

        // Task 2 - Замена слова в строке с учетом регистра.
        // Напишите программу, которая принимает строку, слово для замены и новое слово, заменяет все
        // вхождения старого слова на новое с учетом регистра. Например, если слово для замены "Java",
        // а новое слово "Python", то "java", "Java", "JAVA" должны быть заменены на "python", "Python",
        // "PYTHON" соответственно.

        String text2 = "Java is as versatile as Java can be. JAVA is everywhere!";
        String oldWord = "Java";
        String newWord = "Python";

        String[] words2 = text2.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words2) {
            if (word.equalsIgnoreCase(oldWord)) {
                if (word.equals(oldWord.toUpperCase())) {
                    result.append(newWord.toUpperCase());
                } else if (word.equals(oldWord.toLowerCase())) {
                    result.append(newWord.toLowerCase());
                } else {
                    result.append(newWord);
                }
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());

        // Task 3 - Поиск самого частого слова в строке.
        // Напишите программу, которая анализирует строку и определяет самое часто встречающееся слово в ней.
        // В случае наличия нескольких таких слов, выводится первое в порядке их появления в строке.

        String text3 = "Java is easy to learn, easy to write, and easy to debug";
        String[] words3 = text3.toLowerCase().split("\\s+");

        String mostFrequentWord = "";
        int maxCount = 0;

        for (int i = 0; i < words3.length; i++) {
            int count = 0;
            for (int j = 0; j < words3.length; j++) {
                if (words3[i].equals(words3[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = words3[i];
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
    }
}
