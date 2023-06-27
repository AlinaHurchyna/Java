package powtorkaTablice;

public class Tablica4 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int smallestnumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < smallestnumber) {
                smallestnumber = number[i];

            }

        }
        System.out.println("Najmniejsza liczba: " + smallestnumber);
    }
}
