import java.io.*;

class Element {
    int data;
    Element next;

    public Element(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Element head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addElement(int data) {
        Element newElement = new Element(data);
        if (isEmpty()) {
            head = newElement;
        } else {
            Element current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newElement;
        }
    }

    public void removeElement(int data) {
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Element current = head;
        Element previous = null;
        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Элемент не найден!");
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        Element current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void clearList() {
        head = null;
    }

    public void writeToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Element current = head;
            while (current != null) {
                bufferedWriter.write(current.data + "\n");
                current = current.next;
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл!");
        }
    }

    public void readFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int data = Integer.parseInt(line);
                addElement(data);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла!");
        }
    }
}

public class Second {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addElement(5);
        list.addElement(10);
        list.addElement(15);
        list.printList(); // Выводит: 5 10 15

        list.removeElement(10);
        list.printList(); // Выводит: 5 15

        System.out.println("Список пуст? " + list.isEmpty()); // Выводит: Список пуст? false

        list.clearList();
        list.printList(); // Выводит: Список пуст!

        list.addElement(20);
        list.addElement(25);
        list.printList(); // Выводит: 20 25

        list.writeToFile("list.txt");

        list.clearList();
        list.readFromFile("list.txt");
        list.printList(); // Выводит: 20 25
    }
}
