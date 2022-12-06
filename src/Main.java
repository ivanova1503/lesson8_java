import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = scanner.nextInt();
        int result = 0;
        for (int counter = 1; counter <= n; counter++) {
            if (counter%2==0) continue;
            result+=counter;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до введенного числа: " + result);
    }
}