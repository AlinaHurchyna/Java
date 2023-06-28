package Zoo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Zoo {
    private final Map<String, Integer> animalList = new LinkedHashMap<>();

    private int getNumberOfAllAnimals() {
        return animalList.values()
                .stream()
                .mapToInt(animal -> animal)
                .sum();
    }

    private Map<String, Integer> getAnimalsCount() {
        return animalList;
    }

    private Map<String, Integer> getAnimalsCountSorted() {
        return animalList.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll);
    }

    private void addAnimals(String name, int number) {
        animalList.put(name, number);
    }
}