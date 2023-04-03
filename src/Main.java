import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println("===================");
        task2(nums);
        System.out.println("===================");
        task3(List.of("world", "world", "World", "WORLD", "world"));
        System.out.println("===================");
        task4(List.of("world", "world", "World", "WORLD", "world"));
    }
    private static void task1(List<Integer> nums) {
        for (Integer number : nums) {
            if (number %2 == 1) {
                System.out.println(number + " ");
            }
        }
    }
    private static void task2(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number %2 == 0) {
                System.out.println(number + " ");
            }
        }
    }
    private static void task3(List<String> words) {
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.println(word + " ");
            }
        }
    }
    private static void task4(List<String> words) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
           if (!map.containsKey(word)) {
               map.put(word, 1);
           } else  {
               map.replace(word, map.get(word) + 1);
           }
        }
        System.out.println(map);
    }
}