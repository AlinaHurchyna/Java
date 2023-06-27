package powtorkaTablice;

public class Tablica11 {
    public static void main(String[] args) {
        double[] number = {1.5, 2.0, 3.7, 4.2, 5.7, 6.5, 7.3, 8.6, 9.3, 10.2};
        for (int i = 0; i < number.length; i++) {
            double result = number[i]+1;
            System.out.println("Liczby podniesione do trzeciej potęgi: " + result);

        }
    }
}
