import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите регулярное выражение: ");
        String regexPattern = scanner.nextLine();

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("\nСовпадения с регулярным выражением:");
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }

        System.out.println("\nРазбиение строки на элементы:");
        String[] elements = inputString.split(regexPattern);
        for (String element : elements) {
            System.out.println(element);
        }

        scanner.close();
    }
}
