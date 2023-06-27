package powtorkaTablice;

public class Tablica3 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int biggestnumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > biggestnumber) {
                biggestnumber = number[i];

            }

        }
        System.out.println("Największa liczba: " + biggestnumber);

    }
}
