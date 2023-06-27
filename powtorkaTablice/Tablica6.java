package powtorkaTablice;

public class Tablica6 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int smallestnumber = number[0];
        int licznik = 1;
        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallestnumber) {
                smallestnumber = number[i];
                licznik = 1;
            } else if (number[i] == smallestnumber) {
                licznik++;

            }

        }
        System.out.println("Największa liczba: " + smallestnumber);
        System.out.println("Liczba wystąpien: " + licznik);
    }
}
