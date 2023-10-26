import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        for (;stack.peek()!=0;){
            System.out.println(stack.pop());
        }
    }
        }
class ArrayBasedStack {
    private int [] dataArray;
    private int size;//индекс
    private int capacity;//емкость
    private final int DEFAULT_CAPACITY = 16;//начальная емкость
    private final int MAX_STACK_SIZE = Integer.MAX_VALUE - 1; //максимальная величина стека
    public ArrayBasedStack() {
        dataArray = new int [DEFAULT_CAPACITY];
        capacity = dataArray.length;
        size = 0;
    }
    public void push(int value) {
        if (size >= capacity) {
            boolean resizeResult = upResize();
            if (!resizeResult) {
                throw new RuntimeException("Невозможно добавить");
            }
        }
        dataArray[size] = value;
        size += 1;
    }
    public int pop() { //удаление элемента
        if (size == 0) {
            return 0;
        }
        size -= 1;
        int element = dataArray[size];
        dataArray[size] = 0;
        return element;
    }
    public int peek() {//получение без удаления
        if (size == 0) {
            return 0;
        }
        return dataArray[size - 1];
    }
    public int size() { // получения размера
        return size;
    }
    public boolean upResize() { // метод увеличения размера
        if (capacity >= MAX_STACK_SIZE) {
            return false;
        }
        long newCapacityL = (capacity * 3L) / 2L + 1L;
        int newCapacity = (newCapacityL < MAX_STACK_SIZE) ? (int) newCapacityL : MAX_STACK_SIZE;
        dataArray = Arrays.copyOf(dataArray, newCapacity);
        capacity = newCapacity;
        return true;
    }
    public void trimToSize() {//метод уменьшения размера до содержимого
        dataArray = Arrays.copyOf(dataArray, size);
        capacity = dataArray.length;
    }
    public void clear() { //метод очистки
        dataArray = new int[DEFAULT_CAPACITY];
        capacity = dataArray.length;
        size = 0;
    }
}
