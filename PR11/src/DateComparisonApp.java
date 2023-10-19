import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получение даты от пользователя
        System.out.println("Введите дату в формате dd.MM.yyyy HH:mm:ss: ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        try {
            // Парсинг даты введенной пользователем
            Date userDate = dateFormat.parse(userInput);

            // Получение текущей даты
            Date currentDate = new Date();

            // Сравнение дат
            if (currentDate.before(userDate)) {
                System.out.println("Введенная дата находится в будущем.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Введенная дата находится в прошлом.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой и временем.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при разборе введенной даты.");
        }

        scanner.close();
    }
}

