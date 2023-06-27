package powtorkaTablice;

public class Tablica15 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < number.length; i++) {
            if (number[i]%3 == 0) {
                System.out.println(" Liczby dzielą się przez 3: " + number[i]);

            }

        }
    }
}
