import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter numbers separated by spaces:");
    String[] inputStrings = in.nextLine().split("\\s+");

    int[] input = new int[inputStrings.length];
    for (int i = 0; i < inputStrings.length; i++) {
        input[i] = Integer.parseInt(inputStrings[i]);
    }

    Map<Integer, Integer> result = getCounts(input);
    System.out.println(result);
}

    private static Map<Integer, Integer> getCounts(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        return countMap;
    }
}
