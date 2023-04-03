import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = generate(12);
        task1(nums);
        System.out.println("===================");
        task2(nums);
        System.out.println("===================");
        task3(words);
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
    private static List<String> generate(int n) {
        List<String> list = new ArrayList<>(n);
        int length = 8;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                stringBuilder.append((char)RANDOM.nextInt('а', 'я'));
            }
            list.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
        return list;
    }
}