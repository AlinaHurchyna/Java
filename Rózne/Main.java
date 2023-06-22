package Rózne;
import Item.ArmorItem;
import Item.Helmet;
import Item.Item;
import person.MyRunTimeException;
import person.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final address address = new address("Kolorowa", "Kraków", "PL");

        final Person person = new Teacher("Andrzej", "Chmiel", address, Gender.MALE, "Math");
        final Student student = new Student("Test", "Testowy", null, Gender.UNSPECIFIED, 1234);
        System.out.println(student.getLastName());

        final LivingEntity entity = new NPC("");

        if (entity instanceof final Player player) {
            System.out.println(player.getLevel());
        }

        final Item item = new Helmet("Magic sword", "", 100, 20, Material.IRON);

        entity.getInventory().add(item);

        System.out.println(person.getFirstName());

        Teacher t1 = new Teacher("", "", null, Gender.NON_BINARY, "");
        Teacher t2 = new Teacher("", "", null, Gender.FEMALE, "");
        if (t1.equals(t2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        System.out.println(t1);

        Movable[] movables = {
                new NPC("Vendor"),
                new Player()
        };
        Arrays.stream(movables)
                .map(Movable::getLocation)
                .forEach(System.out::println);

        Textable textable = text -> System.out.println(text + text);
        Textable textable1 = System.out::println;
        textable.write("abc");
        textable1.write("");

        Student student1 = new Student("", "", null, Gender.MALE, 1) {
            @Override
            public int getIndexNumber() {
                return 0;
            }
        };
        System.out.println(student1.getIndexNumber());

        Speakable speakable = text -> System.out.println("I'm anonymous: " + text);
        speakable.speak("Hello!");

        Player player = new Player();
        LivingEntity[] entities = {
                player,
                new NPC("Villager"),
                new LivingEntity() {
                    @Override
                    public void speak(String text) {
                        System.out.println("anonymous entity: " + text);
                    }
                }
        };
        for (LivingEntity entity1 : entities) {
            entity1.speak("the loop");
        }

        LivingEntity[] livingEntities = new LivingEntity[10];
        for (int i = 0; i < 10; i++) {
            int count = i;
            livingEntities[i] = new LivingEntity() {
                @Override
                public void speak(String text) {
                    System.out.println(count + ", " + text);
                }
            };
        }

        for (LivingEntity livingEntity : livingEntities) {
            livingEntity.speak("the last but not least");
        }
        System.out.println(Gender.MALE.getPl());
        System.out.println(student.getGender().getPl());

        Box<Teacher> box = new Box<>(t1);
        System.out.println(box.value());
        print(entity);

        Item item1 = new Helmet("", "", 1, 1, Material.IRON);
        player.getInventory().add(item1);
        player.getInventory()
                .getItems()
                .stream()
                .filter(Objects::nonNull)
                .map(Item::getMetadata)
                .filter(Predicate.not(Map::isEmpty))
                .map(Map::values)
                .flatMap(Collection::stream)
                .map(Metadatum::getValue)
                .forEach(metadatum -> {
                    System.out.println(metadatum);
                    System.out.println(metadatum.getClass().getName());
                });
        for (int i = 0; i < 36; i++) {
            final Item stringItem = player.getInventory().getItems().get(0);
            if (stringItem != null) {
                Map<Class<?>, Metadatum<?>> metadata = stringItem.getMetadata();
                if (!metadata.isEmpty()) {
                    for (Map.Entry<Class<?>, Metadatum<?>> entry : metadata.entrySet()) {
                        Metadatum<?> metadatum = entry.getValue();
                        System.out.println(metadatum.getValue());
                        System.out.println(metadatum.getValue().getClass().getName());
                    }
                }
            }
        }
        speak(new Animal());

        Person.Pet pet = person.new Pet("Rex");
        Box<Integer> box1 = new Box<>(1);
        System.out.println(box1.value());
        System.out.println(box1);
        Item stringItem = player.getInventory().getItems().get(0);
        stringItem.add(Integer.class, new Metadatum<>(1));
        if (stringItem != null) {
            System.out.println(stringItem.getName());
        }
//        System.out.println(player.getHelmet().getName());
//        System.out.println(player.getInventory().getItem(-100));
        try {
            throwsIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            throwsReflectiveOperationException();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        try {
            throwsMyRuntimeException();
        } catch (MyRunTimeException e) {
            e.printStackTrace();
        }
        try {
            throwsMyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
//        readInt();
//        readInt2();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(null);
        System.out.println(list);
        list.stream()
                .filter(Objects::nonNull)
                .map(i -> i + 1)
                .forEach(System.out::println);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(7));
        System.out.println(list.contains(2));
        list.remove(Integer.valueOf(2));
        System.out.println(list);
        list.clear();
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("Hello!");
        set.add("World!");
        set.add("World!");
        set.add("World!");
        System.out.println(set);
        System.out.println(set.contains("World!"));
        System.out.println(set.isEmpty());
        set.remove("Hello!");
        System.out.println(set);

        Set<Entity> entitySet = new TreeSet<>(new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(entitySet);

        Set<Player> playerHashSet = new HashSet<>();
        Set<Player> playerTreeSet = new TreeSet<>(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Player player1 = new Player();
        player1.setName("Rob");
        Player player2 = new Player();
        player2.setName("Tom");
        player2.setLocation(new Location(1, 1));
        playerHashSet.add(player1);
        playerHashSet.add(player1);
        playerHashSet.add(player2);
        playerHashSet.add(player2);
        playerTreeSet.add(player1);
        playerTreeSet.add(player1);
        playerTreeSet.add(player2);
        playerTreeSet.add(player2);
        for (Player player3 : playerTreeSet) {
            System.out.println(player3.getName());
        }
        for (Player player3 : playerHashSet) {
            System.out.println(player3.getName());
        }

        List<Entity> entityList = List.of(
                new NPC("Vendor"),
                player1,
                player1,
                player1
        );
        List<Entity> entities1 = new ArrayList<>(new HashSet<>(entityList));
        System.out.println(entities1);
        Map<String, Entity> map = new HashMap<>();
        map.put("x", player1);
        map.put("y", player1);
        map.put("z", player1);
        map.put("w", player1);
        System.out.println(map);
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        Function<Player, Inventory> playerInventoryFunction = LivingEntity::getInventory;
        System.out.println(playerInventoryFunction.apply(player1));

        Consumer<Item> itemConsumer = item2 -> System.out.println(item2.getName());
        itemConsumer.accept(item1);

        Supplier<NPC> playerSupplier = () -> new NPC("Test");
        System.out.println(playerSupplier.get());

        Predicate<Inventory> inventoryPredicate = inventory ->
                inventory.getItems().isEmpty();

        System.out.println(inventoryPredicate.test(player1.getInventory()));

        IntUnaryOperator function = n -> {
            int result = 0;
            for (int i = 0; i <= n; i++) {
                result += i;
            }
            return result;
        };
        System.out.println(function.applyAsInt(100));

        Random random = new Random();
        IntSupplier randomSupplier = () -> random.nextInt(11);
        System.out.println(randomSupplier.getAsInt());

        Consumer<String> stringConsumer = string -> {
            for (char c : string.toCharArray()) {
                System.out.println(c);
            }
        };
        stringConsumer.accept("abc");

        IntPredicate isPrime = n -> {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(8));
        System.out.println(isPrime.test(7));


        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .average()
                .ifPresent(System.out::println);

        player.getInventory()
                .getItems()
                .stream()
                .map(Item::getName)
                .forEach(System.out::println);

        player.getInventory()
                .getItems()
                .stream()
                .filter(it -> it.getMetadata().isEmpty())
                .forEach(System.out::println);


        // Supplier<Integer> => IntSupplier
        // Stream<Integer> => IntStream
        int sum = player.getInventory()
                .getItems()
                .stream()
                .mapToInt(Item::getValue)
                .sum();
        System.out.println(sum);

        playerTreeSet.stream()
                .filter(p -> p.getHelmet() == null ||
                        p.getChestplate() == null ||
                        p.getLeggins() == null ||
                        p.getBoots() == null)
                .forEach(System.out::println);
        Optional.of(player)
                .map(LivingEntity::getInventory)
                .map(Inventory::getItems)
                .map(itemList -> itemList.get(0))
                .ifPresent(System.out::println);

        System.out.println(Optional.of(player)
                .map(Player::getHelmet)
                .map(ArmorItem::getMaterial)
                .orElse(null));

        System.out.println(Optional.of(player)
                .map(Player::getGold)
                .filter(x -> x != 0)
                .orElseThrow(IllegalArgumentException::new));

        Optional.of(player)
                .map(LivingEntity::getInventory)
                .map(Inventory::getItems)
                .map(itemList -> itemList.stream()
                        .mapToInt(Item::getValue)
                        .average()
                        .orElse(0))
                .filter(i -> i != 0)
                .ifPresent(System.out::println);
        Optional.of(player)
                .map(LivingEntity::getInventory)
                .map(Inventory::getItems)
                .map(itemList -> itemList.stream()
                        .map(Item::getMetadata)
                        .mapToInt(Map::size)
                        .sum())
                .ifPresent(System.out::println);

        Optional.of(player)
                .map(LivingEntity::getInventory)
                .map(Inventory::getItems)
                .map(itemList -> itemList.stream()
                        .filter(item2 -> !item2.getMetadata().isEmpty())
                        .toList())
                .ifPresent(System.out::println);
    }

    public static void throwsIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    public static void throwsReflectiveOperationException() throws ReflectiveOperationException {
        throw new ReflectiveOperationException();
    }

    public static void throwsMyRuntimeException() {
        throw new MyRunTimeException("Yay my exception!");
    }

    public static void throwsMyException() throws MyException {
        throw new MyException("Yay my exception!");
    }

    public static int readInt() {
        while (true) {
            String line = SCANNER.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("It's not an int!");
            }
        }
    }

    public static int readInt2() {
        do {
            if (SCANNER.hasNextInt()) {
                return SCANNER.nextInt();
            }
            SCANNER.nextLine();
            System.out.println("It's not an int!");
        } while (true);
    }

    public static <T extends Entity> void print(T o) {
        System.out.println(o.getName());
    }

    public static <S extends Speakable> void speak(S speakable) {
        speakable.speak("test");
    }
}

