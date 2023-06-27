package powtorkaTablice;

public class Tablica20 {
    public static void main(String[] args) {
        double[] numbers = {-2.5, 3.7, -1.2, 0.8, -5.6, 2.0, 4.5, -3.9, 1.1, -6.3};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }

        for (double liczba : numbers) {
            System.out.println(liczba);
        }
    }
}
