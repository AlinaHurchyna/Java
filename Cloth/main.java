package Cloth;

public class main {
    public static void Main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.addCloth(new Cloth(ClothType.PANTS, ClothColor.RED, 0.5));
        clothing.addCloth(new Cloth(ClothType.SOCKS, ClothColor.RED, 0.1));
        clothing.addCloth(new Cloth(ClothType.T_SHIRT, ClothColor.RED, 0.3));
        System.out.println("Total weight: " + clothing.getTotalWeight()); // Sumaryczna waga: 0.9
        System.out.println("Are all same color? " + clothing.areAllSameColor()); // Czy wszystkie elementy są tego samego koloru? true

        clothing.addCloth(new Cloth(ClothType.BLOUSE, ClothColor.GREEN, 0.4));
        System.out.println("Are all same color? " + clothing.areAllSameColor()); // Czy wszystkie elementy są tego samego koloru? false
    }
}
