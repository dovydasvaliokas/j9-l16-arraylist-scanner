import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVeiksmai {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = new ArrayList<>();        // Double, Boolean, Character, String, Short, Long

        // Pridedu kelis skaičius į listą
        skaiciai.add(5);
        skaiciai.add(8);
        skaiciai.add(15);
        skaiciai.add(15);

        System.out.println("skaiciai = " + skaiciai);       // išvedu listą

        skaiciai.addAll(Arrays.asList(10, 25, 9, 15, 6));      // pridedu kelis skaičius į listą su viena komanda
        System.out.println("skaiciai = " + skaiciai);       // išvedu listą

        skaiciai.add(3, 20);        // į 3-ią indekso vietą pridedu skaičių 20
        System.out.println("skaiciai = " + skaiciai);

        System.out.println("skaiciai.contains(25) = " + skaiciai.contains(25));     // išveda true, jei tas skaičius yra sąraše
        System.out.println("skaiciai.contains(-10) = " + skaiciai.contains(-10));       // false, jei nėra

        System.out.println("skaiciai.size() = " + skaiciai.size());         // size() - sąrašo dydis (kiek yra elementų)

        System.out.println("Penktas elementas pagal indeksą: " + skaiciai.get(5));      // su get galime gauti konkrečioje vietoje pagal indeksą esantį elementą

        int pirmoIrPaskutinioSuma = skaiciai.get(0) + skaiciai.get(skaiciai.size() - 1);        // konkrečios vietos elementus galime naudoti ir veiksmuose, taip pat kaip ir size() galime naudoti indekso nusakymui
        System.out.println("pirmoIrPaskutinioSuma = " + pirmoIrPaskutinioSuma);

        System.out.println("skaiciai.indexOf(15) = " + skaiciai.indexOf(15));       // suranda pirmo pasitaikusio 15 indeksą
        System.out.println("skaiciai.indexOf(-20) = " + skaiciai.indexOf(-20));     // jeigu tokio skaičiaus nėra - grąžina -1
        System.out.println("skaiciai.lastIndexOf(15) = " + skaiciai.lastIndexOf(15));       // suranda paskutinio pasitaikiusio 15 indeksą

        skaiciai.remove(3);     // ištrina 3-ią skaičių pagal indeksą
        System.out.println("skaiciai = " + skaiciai);
        skaiciai.remove(Integer.valueOf(15));       // ištrina pirmą pasitaikusį elementą, kurio reikšmė yra 15
        System.out.println("skaiciai = " + skaiciai);
        skaiciai.removeAll(Arrays.asList(15, 6));           // ištrina visus elementus, kurių reikšmė yra 15 arba 6
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.set(0, 20);            // pakeičia pirmo (0 pagal indeksą) skaičiaus reikšmę į 20
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.set(skaiciai.size() - 2, -100);            // pakeičia priešpaskutinio skaičiaus reikšmę į -100
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.clear();           // ištrina visus elementus
        System.out.println("skaiciai = " + skaiciai);
    }
}
