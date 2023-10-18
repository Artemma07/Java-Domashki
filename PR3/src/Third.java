import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.*;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (n + 1));
        }

        System.out.print("Оригинальный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("В массиве нет четных чисел.");
        } else {
            int[] evenArray = new int[evenCount];
            int index = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    evenArray[index] = num;
                    index++;
                }
            }

            System.out.print("Массив из четных элементов: ");
            for (int num : evenArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}