import java.util.List;

public class Calculator {

    public double divide(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Список должен содержать как минимум два элемента");
        }

        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);

        if (secondNumber == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }

        double result = (double) firstNumber / secondNumber;
        return result;
    }
}