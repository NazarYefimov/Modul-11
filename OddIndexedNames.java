import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class OddIndexedNames {

    public static void main(String[] args) {
     
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        names.add("Eve");
        names.add("Frank");

        String result = formatNames(names);
        System.out.println(result);
    }

    public static String formatNames(List<String> names) {
        return IntStream.range(1, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
