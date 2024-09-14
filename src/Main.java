import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%.3f\n", (float)1/i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        while (sc.hasNextInt())
        {
            System.out.println("Факториал числа: " + fact(sc.nextInt()));
        }
    }

    private static int fact (int n)
    {
        int sum = 1;
        for (int i = n; i > 1; i--)
        {
            sum *= i;
        }
        return sum;
    }
}