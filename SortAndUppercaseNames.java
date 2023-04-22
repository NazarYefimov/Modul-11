import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

class SortAndUppercaseNames {
    public static void main(String[] args) {
       
        List<String> names = List.of("Ivan", "Peter", "Oksana", "Andrii", "Maria", "Maxim");

        List<String> result = sortAndUppercase(names);
        System.out.println(result);
    }

    public static List<String> sortAndUppercase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase) 
                .sorted(Collections.reverseOrder()) 
                .collect(Collectors.toList()); 
    }
}
