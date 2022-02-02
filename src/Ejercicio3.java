import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<Integer> enteros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != -1) {
            System.out.println("Introuducir números enteros: ");
            i = sc.nextInt();
            enteros.add(i);
        }
        System.out.println(enteros);

        for (int j = 0; j < enteros.size(); j++) {
            if (enteros.get(j) % 2 == 0) {
                System.out.println(enteros.get(j));
            }
            for ( j = 0; j < enteros.size(); j++) {
                if (enteros.get(j)%3==0) {
                    enteros.remove(j);
                }

            }
            System.out.println(enteros);
        }

    }
}

