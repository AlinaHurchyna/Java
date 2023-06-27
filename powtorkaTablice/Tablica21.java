package powtorkaTablice;

public class Tablica21 {
    public static void main(String[] args) {
        double[] liczby = {1.5, 2.7, 3.2, 4.8, 5.6, 6.2, 7.4, 8.9, 9.1, 10.3};

        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }

    }
}
