import java.sql.SQLOutput;

class Node {
    int data; // данные узла
    Node next; // ссылка на следующий узел

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    private Node top; // вершина стека

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data); // создаем новый узел
        if (isEmpty()) {
            top = newNode; // если стек пустой, новый узел становится вершиной
        } else {
            newNode.next = top; // новый узел указывает на текущую вершину
            top = newNode; // новый узел становится вершиной
        }
    }

    public int pop() {
        int data = top.data; // сохраняем данные текущей вершины
        top = top.next; // перемещаем вершину на следующий узел
        return data;
    }

    public int peek() {
        /*if (isEmpty()) {
            throw new EmptyStackException();
        }*/
        return top.data; // возвращаем данные текущей вершины
    }

    public boolean isEmpty() {
        return top == null; // возвращает true, если стек пустой
    }
}
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // выводит 3
        System.out.println(stack.peek()); // выводит 2
        System.out.println(stack.pop()); // выводит 2
        System.out.println(stack.isEmpty()); // выводит false
    }
}