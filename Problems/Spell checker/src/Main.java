import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> knownWords = new HashSet<>();
        String count = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(count); i++) {
            knownWords.add(scanner.nextLine().toLowerCase());
        }

        Set<String> textWords = new HashSet<>();
        count = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(count); i++) {
            textWords.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split("\\s+", 0)));
        }

        textWords.removeAll(knownWords);
        textWords.forEach(System.out::println);
    }
}