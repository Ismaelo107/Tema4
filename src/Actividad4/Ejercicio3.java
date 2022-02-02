package Actividad4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean out = false;
        List <Integer> pares = new ArrayList<>();
        List <Integer> impares = new ArrayList<>();

        while (!out) {
            System.out.println("Introducir número: ");
            int num = sc.nextInt();
            if(num !=0){
                if (num%2==0){
                    pares.add(num);
                }else{
                    impares.add(num);
                }

            }else{
                out = true;
            }
        }

        List <Integer> tot = new ArrayList<>(){{addAll(pares); addAll(impares); }};
        System.out.println(impares);
        System.out.println(pares);
        System.out.println(tot);
    }
}
