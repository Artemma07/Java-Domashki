public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Стек: " + stack);

        System.out.println("Верхний элемент: " + stack.peek());
        System.out.println("Удаленный элемент: " + stack.pop());
        System.out.println("Новый верхний элемент: " + stack.peek());

        System.out.println("Стек пуст? " + stack.isEmpty());
        System.out.println("Размер стека: " + stack.size());
    }
}
