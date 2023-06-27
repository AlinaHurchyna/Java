package powtorkaTablice;

public class Tablica19 {
    public static void main(String[] args) {
        int[] number = {2, 5, 10, 15, 20, 25, 30, 35, 40, 45};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                number[i] += 100;
            }
        }

        for (int liczba : number) {
            System.out.println(liczba);
        }
    }
}
