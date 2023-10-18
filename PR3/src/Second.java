import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

public class Second {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        String message = isIncreasing ? "массив является строго возрастающей последовательностью" : "нет";
        System.out.println(message);
    }
}