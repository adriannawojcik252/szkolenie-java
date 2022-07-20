package RozwiazaniaZadan._16_07;

import java.util.Scanner;

/*Praca domowa 16-07-2022
        1) do wykonanaia zadanie, które polega na pobraniu od użytkownika informacji wprowadzonych z klawiatury.
        a) 5 razy Integer
        b) 5 razy BigDecimal
        dla każdej opcji powyżej wykonać dodawanie wprowadzonych liczb, mnożenie przez 10 każdej z liczb oraz dzielenie przez 2 każdej z liczb
        Wyniki zaprezentować w postaci:
        Dodawanie liczb [a, b, c, d, e]: w
        Mnożenie przez 10 liczb:
        a*10: w
        b*10: w
        c*10: w
        d*10: w
        e*10: w
        etc.
 */

public class Zadanie1 {
    public static void Rozwiazanie() {
        Scanner scanner = new Scanner(System.in);
        Integer[] tabInts = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę");
            tabInts[i] = scanner.nextInt();
        }

        Integer sum = tabInts[0] + tabInts[1] + tabInts[2] + tabInts[3] + tabInts[4];
        System.out.println("Wynik dodawania liczb: "+ sum);
        Integer firstNumber = tabInts[0] * 10;

        for (int i = 0; i < 5; i++) {
            System.out.println(tabInts[i] + "*10: " +tabInts[i] *10);
        }
    }
}
