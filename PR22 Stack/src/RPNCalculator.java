import java.util.Stack;

public class RPNCalculator {
    public static double calculateRPN(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для оператора: " + token);
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 == 0) {
                            throw new ArithmeticException("Деление на ноль");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Неизвестный оператор: " + token);
                }
            } else {
                throw new IllegalArgumentException("Недопустимый токен: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Неверное количество операторов и операндов");
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) { //проверка на число
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String str) {// проверка на оператора
        return str.matches("[+\\-*/]");
    }

    public static void main(String[] args) {
        String rpnExpression = "3 4 + 5 *";
        try {
            double result = calculateRPN(rpnExpression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

