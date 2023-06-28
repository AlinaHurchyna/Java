package Ex;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Exercise14 {
    public static void main(final String[] args) {
        final Random random = new Random();
        final List<Integer> integers = Stream.generate(() -> random.nextInt(100000))
                .limit(100000)
                .toList();

        // ex 1
        final List<Integer> distinct = integers.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        // ex 2
        final List<Integer> dupes = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(dupes);

        // ex 3
        integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> Long.compare(o2.getValue(), o1.getValue()))
                .limit(25)
                .forEach(System.out::println);
    }
}

