package Ex;

import java.util.Map;
import java.util.stream.Collectors;

public final class Exercise3 {
	public static void main(final String[] args) {
		final Map<String, Integer> map = Map.ofEntries(Map.entry("Java", 18), Map.entry("Python", 1), Map.entry("PHP", 0));
		printMap(map);
	}

	public static void printMap(final Map<String, Integer> map) {
		final String collect = map.entrySet()
				.stream()
				.map(entry -> String.format("Klucz: %s, Wartość: %d", entry.getKey(), entry.getValue()))
				.collect(Collectors.joining(",\n")) + ".";
		System.out.println(collect);
	}
}

