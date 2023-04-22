import java.util.Iterator;
import java.util.stream.Stream;

class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        Stream<T> zippedStream = first.flatMap(x -> secondIterator.hasNext() ? Stream.of(x, secondIterator.next()) : Stream.empty());
        return zippedStream;
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10, 11);
        
        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println); 
    }
}
