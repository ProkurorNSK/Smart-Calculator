package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();

            switch (text) {
                case "/exit":
                    System.out.println("Bye!");
                    return;
                case "/help":
                    System.out.println("The program calculates the sum of numbers");
                    break;
                case "":
                    continue;
                default:
                    String[] numbers = text.split("\\s+");
                    int result = 0;
                    for (String element: numbers) {
                        result += Integer.parseInt(element);
                    }
                    System.out.println(result);
            }
        }
    }
}
