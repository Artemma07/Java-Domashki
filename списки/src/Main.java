import java.util.Scanner;

// Класс, описывающий узел списка - элемент картотеки
class CardNode {
    private String name;
    private int age;

    // Функция для считывания атрибутов объекта с консоли
    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    // Функция для вывода атрибутов на экран
    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// Главный класс приложения
public class Main {
    public static void main(String[] args) {
        // Создаем новый экземпляр класса CardNode
        CardNode cardNode = new CardNode();

        // Считываем атрибуты объекта с консоли
        cardNode.readAttributes();

        // Выводим атрибуты на экран
        cardNode.displayAttributes();
    }
}



