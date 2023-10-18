import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;
import static java.lang.Math.*;

public class First {
    public static void main(String[] args) {

        double[] array = new double[5];

        // Генерация и вывод на экран массива с использованием метода random() класса Math
        System.out.println("Массив с использованием метода random() класса Math:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
            System.out.println(array[i]);
        }


        Arrays.sort(array);

        System.out.println("Отсортированный массив:");
        for (double number : array) {
            System.out.println(number);
        }


        System.out.println("Массив с использованием класса Random:");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
            System.out.println(array[i]);
        }

        Arrays.sort(array);

        System.out.println("Отсортированный массив:");
        for (double number : array) {
            System.out.println(number);
        }
    }
}