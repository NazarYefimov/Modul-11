import java.util.stream.Stream;

class LinearCongruentialGenerator {
    public static Stream<Long> generate(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generate(0L, a, c, m);
        randomStream.limit(10).forEach(System.out::println);
    }
}