import java.util.Scanner;

public class CALCULATOR
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = scanner.nextLine();
        String[] parts = str.split(" ");
        int variableFirst = Integer.parseInt(parts[0]);
        int variableSecond = Integer.parseInt(parts[2]);
        String mathematicalOperation = String.valueOf(parts[1]);
        System.out.println(variableFirst );
        System.out.println(variableSecond );
        System.out.println(mathematicalOperation );
        switch (mathematicalOperation)
        {
        
            case "+": 
                System.out.print(variableFirst + variableSecond);
                break;
            // case 2:
            //     System.out.print(variableFirst - variableSecond);
            //     break;
            // case 3:
            //     System.out.print(variableFirst * variableSecond);
            //     break;
            // case 4:
            //     if (variableSecond != 0)
            //     {
            //         System.out.print(variableFirst / variableSecond);
            //     }
            //     else System.out.println("Нельзя делить на ноль");
                
            //     break;
            default: System.out.println("Ошибка ввода данных");
        }

    }
}