package powtorkaTablice;

public class Tablica5 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int biggestnumber = number[0];
        int licznik = 1;
        for (int i = 1; i < number.length; i++) {
            if (number[i] > biggestnumber) {
                biggestnumber = number[i];
                licznik = 1;
            } else if (number[i] == biggestnumber) {
                licznik++;

            }

        }
        System.out.println("Największa liczba: " + biggestnumber);
        System.out.println("Liczba wystąpien: " + licznik);
    }
}
