package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = 0;
            int b = 0;
            String text = scanner.nextLine();

            if ("/exit".equals(text)) {
                System.out.println("Bye!");
                break;
            }
            if (text.isEmpty()) continue;

            String[] numbers = text.split("\\s+");
            a = Integer.parseInt(numbers[0]);
            if (numbers.length > 1) {
                b = Integer.parseInt(numbers[1]);
            }

            System.out.println(a + b);
        }
    }
}
