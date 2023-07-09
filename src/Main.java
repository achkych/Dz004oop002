import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Integer> integerList = List.of(5, 7, 3, 2);
        double divideResult = calculator.divide(integerList);
        System.out.println("Результат деления: " + divideResult);
        }
    }
