package Actividad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            num.add((int) (Math.random() * 10 + 1));
        }
        for (Integer numeros : num) {
            System.out.print(numeros);
        }

        Iterator<Integer> it = num.iterator();

        while(it.hasNext()) {
            Integer i = it.next();
            if(i == 5) {
                it.remove();
            }
        }
        System.out.println();
        System.out.println(num);
    }
}
