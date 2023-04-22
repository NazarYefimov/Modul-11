import java.util.ArrayList;
import java.util.List;

public class OddIndexedNames {
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
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < names.size(); i += 2) {
            sb.append(i).append(". ").append(names.get(i)).append(", ");
        }
     
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }
}