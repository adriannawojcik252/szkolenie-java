package RozwiazaniaZadan._16_07;

import Modele.Model;
import Modele.Kolor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 2) do wykonania zadanie nr 2.
        Utworzyć  w 'resources' podkatalog o nazwie 'samochody'
        Następnie utworzyć 3 pliki: samochod1, samochod2, samochod3
        w każdym pliku utworzyć strukturę pojazdu w oparciu o klasę 'Model'
        Każdy plik należy zainicjalizować do nowego obiektu
        Następnie wyświetlić następujące informacje:
        Pojazd nr 1: w
        Pojazd nr 2: w
        Pojazd nr 3: w
        Laczna ilosc przejechanych kilometrow przez samochody: w
        Dostepne pojemosci silnikow samochodow: x, y, z
        Do wykonania zadania nalezy wykorzystać zdobytą wiedzę z odbytych zajęć */
public class Zadanie2 {

    public static void Rozwiazanie() {
        try {
            Model samochod1 = daneOModeluPojazdu(new File("resources/samochody/samochod1.txt"));
            Model samochod2 = daneOModeluPojazdu(new File("resources/samochody/samochod2.txt"));
            Model samochod3 = daneOModeluPojazdu(new File("resources/samochody/samochod3.txt"));

            System.out.println("Pojazd nr 1: " + samochod1);
            System.out.println("Pojazd nr 2: " + samochod2);
            System.out.println("Pojazd nr 3: " + samochod3);

            var lacznyPrzebieg = samochod1.getPrzebieg() + samochod2.getPrzebieg() + samochod3.getPrzebieg();

            System.out.println("Laczna ilosc przejechanych kilometrow przez samochody: " + lacznyPrzebieg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException
    {
        Model modelPojazdu = new Model();
        Scanner scan = new Scanner(plikZew);
        String liniaWPliku = scan.nextLine();
        String[] tablicaPliku = liniaWPliku.split(", ");

        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

        return modelPojazdu;
    }
}
