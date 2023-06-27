package powtorkaTablice;

public class Tablica17 {
    public static void main(String[] args) {
        int[] number = {24, 13, 48, 206, 402, 82, 176, 56, 345, 800};
        for (int i = 0; i < number.length; i++) {
            if (CyfryParzyste(number[i])) {
                System.out.println("Liczby, które mają wszystkie cyfry parzyste: " + number[i]);
            }
        }
    }


    public static boolean CyfryParzyste(int number) {
        while (number > 0) {
            int cyfra = number % 10;
            if (cyfra % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}


