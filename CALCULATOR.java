import java.util.Scanner;

public class CALCULATOR
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое чило: ");
        float variableFirst = scanner.nextFloat();
        System.out.print("Введите второе чило: ");
        float variableSecond = scanner.nextFloat();
        System.out.println("Выберите действие под номером 1 + 2 - 3 * 4 /");
        int actionNumber = scanner.nextInt();
        switch (actionNumber)
        {
        
            case 1: 
                System.out.print(variableFirst + variableSecond);
                break;
            case 2:
                System.out.print(variableFirst - variableSecond);
                break;
            case 3:
                System.out.print(variableFirst * variableSecond);
                break;
            case 4:
                if (variableSecond != 0)
                {
                    System.out.print(variableFirst / variableSecond);
                }
                else System.out.println("Нельзя делить на ноль");
                
                break;
            default: System.out.println("Ошибка ввода данных");
        }

    }
}