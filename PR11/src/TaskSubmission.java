import java.util.Date;
import java.text.SimpleDateFormat;

public class TaskSubmission {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Ma";

        // Дата и время получения задания
        Date dateAssigned = new Date(); // Текущая дата и время

        // Дата и время сдачи задания (пример - 7 дней после получения)
        long submissionMillis = dateAssigned.getTime() + 7 * 24 * 60 * 60 * 1000; // Добавляем 7 дней в миллисекундах
        Date dateSubmitted = new Date(submissionMillis);

        // Формат для вывода даты и времени
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(dateAssigned));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(dateSubmitted));
    }
}
