import java.util.stream.Stream;

class StreamZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(
                first.map(i -> new Object[]{1, i}),
                second.map(i -> new Object[]{2, i}))
                .sorted((o1, o2) -> Integer.compare((int) o1[0], (int) o2[0]))
                .map(o -> (T) o[1]);
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4);
        Stream<Integer> second = Stream.of(5, 6, 7, 8);

        Stream<Integer> result = zip(first, second);
        result.forEach(System.out::println);
    }
}