package Actividad5.Ejercicio1;

import java.util.*;

public class Ej1 {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerList.add((int) (Math.random() * 10) + 1);
        }

        for (int lista : integerList) {
            System.out.print(lista);
        }
        System.out.println();



        Set<Integer> conjunto = new HashSet<Integer>(integerList);
        System.out.println(conjunto);


        integerList.remove(conjunto);

        System.out.print(integerList);

        Set<Integer> conjunto2 = new TreeSet<Integer>(integerList);
        System.out.println();

        System.out.println(conjunto2);

    }

}

