import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            System.out.println(fact(sc.nextInt()));
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