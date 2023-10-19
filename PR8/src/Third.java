public class Third {
    public static void main(String[] args) {
        int N = 12345;
        reversePrintDigits(N);
    }

    public static void reversePrintDigits(int N) {
        if (N < 10) {
            System.out.println(N); // Выводим последнюю цифру
        } else {
            int lastDigit = N % 10; // Получаем последнюю цифру
            System.out.println(lastDigit); // Выводим последнюю цифру
            reversePrintDigits(N / 10); // Рекурсивный вызов для оставшейся части числа
        }
    }
}
