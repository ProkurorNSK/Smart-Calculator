import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> result = new TreeMap<>();
        for (String string : strings) {
            result.put(string, result.getOrDefault(string, 0) + 1);
        }
        return result;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((x, y) -> System.out.println(x + " : " + y));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}