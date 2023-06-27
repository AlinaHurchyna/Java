package powtorkaTablice;

public class Tablica2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Liczby w tablicy w odwrotnej kolejnosci: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);

        }
    }
}
