import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = 12345;
        int sum = sumN(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    public static int sumN(int N) {
        if (N == 0) {
            return 0;
        } else {
            int last = N % 10; // Получаем последнюю цифру числа
            int ostatok = N / 10; // Получаем оставшуюся часть числа без последней цифры
            return last + sumN(ostatok); // Рекурсивный вызов для оставшейся части числа
        }
    }
}
