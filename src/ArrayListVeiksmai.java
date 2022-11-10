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

        System.out.println("skaiciai.contains(25) = " + skaiciai.contains(25));
        System.out.println("skaiciai.contains(-10) = " + skaiciai.contains(-10));

        System.out.println("skaiciai.size() = " + skaiciai.size());

        System.out.println("Penktas elementas pagal indeksą: " + skaiciai.get(5));

        int pirmoIrPaskutinioSuma = skaiciai.get(0) + skaiciai.get(skaiciai.size() - 1);
        System.out.println("pirmoIrPaskutinioSuma = " + pirmoIrPaskutinioSuma);

        System.out.println("skaiciai.indexOf(15) = " + skaiciai.indexOf(15));
        System.out.println("skaiciai.indexOf(-20) = " + skaiciai.indexOf(-20));
        System.out.println("skaiciai.lastIndexOf(15) = " + skaiciai.lastIndexOf(15));

        skaiciai.remove(3);
        System.out.println("skaiciai = " + skaiciai);
        skaiciai.remove(Integer.valueOf(15));
        System.out.println("skaiciai = " + skaiciai);
        skaiciai.removeAll(Arrays.asList(15, 6));
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.set(0, 20);
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.set(skaiciai.size() - 2, -100);
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.clear();
        System.out.println("skaiciai = " + skaiciai);
    }
}
