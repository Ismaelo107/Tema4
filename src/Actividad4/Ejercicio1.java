package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            num.add((int) (Math.random() * 10 + 1));
        }

        for (Integer numero : num) {
            System.out.println(numero);
        }

        int i = 0;
        while (num.remove(Integer.valueOf(5))) {
            i++;
        }
        System.out.println("Se han eliminado " + i + " elementos con el valor 5");
        System.out.println("Imprimimos el arraylist sin los elementos con el valor 5");
        for (Integer numero : num) {
            System.out.println(numero);
        }

    }
}
