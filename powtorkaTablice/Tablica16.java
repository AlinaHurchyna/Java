package powtorkaTablice;

public class Tablica16 {
    public static void main(String[] args) {
        double[] number = {2.5, 7.8, 10.3, 4.7, 12.1, 15.6, 6.2, 9.9, 3.8, 14.5};
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 4 && number[i] < 15) {
                System.out.println("Liczbu w przedziale [4;15): "+number[i]);
            }
        }
    }
}
