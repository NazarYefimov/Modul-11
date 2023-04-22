import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class SortAndUppercaseNames {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Peter");
        names.add("Oksana");
        names.add("Andrii");
        names.add("Maria");
        names.add("Maxim");

        
        List<String> result = sortAndUppercase(names);
        System.out.println(result);
    }

    public static List<String> sortAndUppercase(List<String> names) {
      
        List<String> result = new ArrayList<>(names);

        // Перетворюємо всі імена в верхній регістр
        for (int i = 0; i < result.size(); i++) {
            String name = result.get(i);
            result.set(i, name.toUpperCase());
        }

        // Сортуємо імена за спаданням
        Collections.sort(result, Collections.reverseOrder());

        return result;
    }
}