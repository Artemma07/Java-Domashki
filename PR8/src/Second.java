public class Second {
    public static void main(String[] args) {
        String word = "aboba";
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        // Удаляем все пробелы и приводим к нижнему регистру
        word = word.replaceAll(" ", "").toLowerCase();
        int length = word.length();

        if (length <= 1) {
            return true; // Однобуквенное слово или пустая строка считаются палиндромами
        } else if (word.charAt(0) != word.charAt(length - 1)) {
            return false; // Первая и последняя буквы не совпадают
        } else {
            // Рекурсивный вызов для внутренней части слова
            return isPalindrome(word.substring(1, length - 1));
        }
    }
}

