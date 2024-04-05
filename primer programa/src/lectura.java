import java.util.Scanner;

public class lectura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Pelicula fav:");
        String pelicula = teclado.nextLine();
        System.out.println("Fecha de lanzamiento:");
        int fechaLanza = teclado.nextInt();
        System.out.println("Califica la peli:");
        double nota = teclado.nextDouble();


        System.out.println( nombre + " tiene como pelicula favorita " + pelicula + " que salio en " + fechaLanza + " y la calificacion que se le da, es de: " + nota);

    }
}
