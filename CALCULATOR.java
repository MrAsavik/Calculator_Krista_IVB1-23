import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение (например, 5 + 3): ");
        String str = scanner.nextLine();
        
        
        String[] parts = str.split(" ");
        
        
        if (parts.length != 3) {
            System.out.println("Ошибка ввода! Введите выражение в формате: ЧИСЛО ОПЕРАТОР ЧИСЛО");
            return;
        }

        try {
            int variableFirst = Integer.parseInt(parts[0]);
            int variableSecond = Integer.parseInt(parts[2]);
            String mathematicalOperation = parts[1];

            switch (mathematicalOperation) {
                case "+":
                    System.out.println("Результат: " + (variableFirst + variableSecond));
                    break;
                case "-":
                    System.out.println("Результат: " + (variableFirst - variableSecond));
                    break;
                case "*":
                    System.out.println("Результат: " + (variableFirst * variableSecond));
                    break;
                case "/":
                    if (variableSecond != 0) {
                        System.out.println("Результат: " + (variableFirst / variableSecond));
                    } else {
                        System.out.println("Ошибка: Нельзя делить на ноль!");
                    }
                    break;
                default:
                    System.out.println("Ошибка ввода: неверный оператор! Используйте +, -, *, /");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите корректные числа!");
        }
    }
}
