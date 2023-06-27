package powtorkaTablice;

import java.util.Arrays;

public class Tablica8 {
    public static void main(String[] args) {
        int number []={1,2,3,4,5,6,7,8,9,10};
        int secondLaggest=-1;
        Arrays.sort(number);
        for (int i = 1; i<number.length ; i++) {
            if (number[i]> number[0]) {
                secondLaggest=number[i];
                break;

            }

        }
        if (secondLaggest !=-1) {
            System.out.println("Drugi co do wielkosci wyraz: "+secondLaggest);
        }else {
            System.out.println("Brak drugiegi co do wielkosci wyrazu.");
        }

    }

}
