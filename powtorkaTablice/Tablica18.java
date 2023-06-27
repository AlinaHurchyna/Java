package powtorkaTablice;

public class Tablica18 {
    public static void main(String[] args) {
        // Tworzenie tablicy 10 liczb całkowitych
        int[] number = {24, 13, 48, 10, 56, 202, 301, 70, 9, 800};

        for (int i = 0; i < number.length; i++) {
            if (sumaCyfr(number[i]) == 1) {
                System.out.println( "Liczby, których suma cyfr wynosi 1: " +number[i]);
            }
        }
    }

    public static int sumaCyfr(int number) {
        int suma = 0;

        while (number > 0) {
            suma += number% 10;
            number/= 10;
        }

        return suma;
    }
}

