import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListoNuskaitymasIsKonsoles {
    public static void main(String[] args) {
        ArrayList<Double> skaiciai = sarasoNuskaitymas();
        System.out.println("skaiciai = " + skaiciai);
        System.out.println("sarasoSuma(skaiciai) = " + sarasoSuma(skaiciai));
    }

    /**
     * Nuskaito sąrašą iš konsolės. Vartotojas turi įvesti kiek bus sąraše skaičių ir tada po vieną suvesti visus skaičius
     * @return nuskaitytą sąrašą
     */
    public static ArrayList<Double> sarasoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);           // sukuriu Scanner objektą, kuris skaitys iš konsolės (System.in)
        ArrayList<Double> sarasas = new ArrayList<>();      // sukuriu tuščią sąrąšą, į kurį saugosime nuskaitomus skaičius
        System.out.println("Įveskite kiek skaičių bus sąraše: ");
        int n = skaitytuvas.nextInt();          // nuskaitome kiek bus iš viso sąraše skaičių, jog galėtume patogiau sukti ciklą

        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ą sąrašo elementą: ");
            sarasas.add(skaitytuvas.nextDouble());              // į sąrašą įdedame tą, ką nuskaito scannerio objetkas
        }
        return sarasas;
    }

    /**
     * Apskaičiuoja skaičių sąrašo sumą
     * @param sarasas sąrašas, kurio sumą skaičiuosime
     * @return suma
     */
    public static double sarasoSuma(ArrayList<Double> sarasas) {
        double suma = 0;
        for (int i = 0; i < sarasas.size(); i++) {
            suma += sarasas.get(i);
        }
        return suma;
    }
}
