import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String titulo = "";
        int ISBN = 0;
        String autor = "";
        BuscarLibro[] libros = new BuscarLibro[5];
        libros[0] = new BuscarLibro("El Quijote", "123456789", "Cervantes");
        libros[1] = new BuscarLibro("La celestina", "123456783", "Antonio de Nebrija");
        libros[2] = new BuscarLibro("El niño con el pijama de rayas ", "123456787", "John Boyne");
        libros[3] = new BuscarLibro("El diario de Ana Frank", "123456780", "Ana Frank");
        libros[4] = new BuscarLibro("El señor de los anillos", "123456785", "J.R.R. Tolkien");
        //pedir al usuario que inserte el titulo del libro
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro");
        titulo = sc.nextLine();
        //pedir al usuario que inserte el ISBN del libro
        System.out.println("Introduce el ISBN del libro");
        ISBN = Integer.parseInt(sc.nextLine());
        //pedir al usuario que inserte el autor del libro
        System.out.println("Introduce el autor del libro");
        autor = sc.nextLine();
        //recorrer el array de libros
        for (int i = 0; i < libros.length; i++) {
            //comprobar si el libro existe
            if (libros[i].buscarLibro(titulo)) {
                System.out.println("El libro existe");
            } else {
                System.out.println("El libro no existe");
            }
        }
        //el libro se ha resevado
        ReservarLibro reserva = new ReservarLibro(titulo, ISBN, autor);
        if (reserva.reservarLibro(titulo)) {
            System.out.println("El libro se ha reservado");
        } else {
            System.out.println("El libro no se ha reservado");
        }
    }




    }

