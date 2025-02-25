import java.util.Scanner;

public class CALCULATOR
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        System.out.print("Введите первое чило: ");
        float variableFirst = scanner.nextFloat();
        System.out.print("Введите второе чило: ");
        float variableSecond = scanner.nextFloat();
        System.out.println("Выберите действие под номером 1 + 2 - 3 * 4 /");
        int actionNumber = scanner.nextInt();
        switch (actionNumber)
        {
        
            case 1:
            case 2:
            case 3:
            case 4:
            default: System.out.println("Ошибка ввода данных");
        }

    }
}