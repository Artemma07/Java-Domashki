import java.util.LinkedList;

public class Stack<T> { //тип T  позволяет хранить элементы любого типа данных
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T item) { //добавляет элемент в верхнюю часть стека.
        list.addFirst(item);
    }

    public T pop() { //удаляет и возвращает верхний элемент из стека.
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.removeFirst();
    }

    public T peek() {  //возвращает верхний элемент без его удаления
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.getFirst();
    }

    public boolean isEmpty() { //проверяет, пуст ли стек
        return list.isEmpty();
    }

    public int size() {//возвращает размер стека
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
