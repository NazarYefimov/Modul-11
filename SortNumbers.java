import java.util.Arrays;
import java.util.stream.Collectors;

class SortNumbers {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String result = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(String::trim)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
