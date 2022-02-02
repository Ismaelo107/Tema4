package Actividad5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej1 {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerList.add((int) (Math.random() * 10) + 1);
        }

        for (int lista : integerList) {
            System.out.println(lista);
        }

        Set<Integer> conjunto = new HashSet<Integer>(integerList);

        System.out.println(conjunto);


    }

}

