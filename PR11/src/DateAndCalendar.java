import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите число :");
        int day = scanner.nextInt();

        System.out.println("Введите часы :");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты :");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 1900, month - 1, day, hours, minutes);

        // Создание объекта Calendar и установка даты и времени
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0); // Устанавливаем секунды в 0

        // Вывод полученных объектов Date и Calendar
        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());

        scanner.close();
    }
}

