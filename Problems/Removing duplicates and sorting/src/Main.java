import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new TreeSet<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            stringSet.add(scanner.next());
        }
        stringSet.forEach(System.out::println);
    }
}