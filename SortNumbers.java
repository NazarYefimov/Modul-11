import java.util.Arrays;

class SortNumbers {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String merged = String.join(",", arr); 
        String[] numbers = merged.split(",\\s*");
        int[] intArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i].trim()); 
        }
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}