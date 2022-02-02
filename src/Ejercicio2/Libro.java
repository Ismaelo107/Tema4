package Ejercicio2;

import java.util.Scanner;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;

    public Libro() {
    }

    public void introducirLibros() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Libro[] libros= new Libro[10];
        int i = 0;
        boolean salida = false;
        while (!salida) {
            i++;
            System.out.println("""
                    1 - Introducir libro
                    2 - Imprimir libros almacenados
                    3 - Buscar libros por id
                    4 - Salir
                    """
            );

            switch (num) {
                case 1:
                    System.out.println("Has seleccionado la opcion número 1");
                    System.out.println("Introducir id:");
                    int setId = sc.nextInt();
                    System.out.println("Introducir Título:");
                    String setTitulo = sc.next();
                    System.out.println("Introducir Autor:");
                    String setAutor = sc.next();
                    System.out.println("Introducir Editorial:");
                    String setEditorial = sc.next();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion número 2");
                case 3:
                    System.out.println("Has seleccionado la opcion número 3");
                case 4:
                    salida = true;
                    System.out.println("Has seleccionado la opcion número 4");

            }
        }
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}