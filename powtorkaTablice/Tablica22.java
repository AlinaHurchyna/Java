package powtorkaTablice;

public class Tablica22 {
    public static void main(String[] args) {
        double[] liczby = {1.5, 2.7, 3.2, 4.8, 5.6, 6.2, 7.4, 8.9, 9.1, 10.3};

        for (int i = 0; i < liczby.length; i++) {
            int sqrtIndex = (int) Math.sqrt(i);
            if (sqrtIndex * sqrtIndex == i) {
                System.out.println(liczby[i]);
            }
        }
    }
}
