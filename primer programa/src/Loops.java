import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluar = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota que le das a la peli, Marley y yo:");
            nota = teclado.nextDouble();
            mediaEvaluar = mediaEvaluar + nota;
        }
        System.out.println("La promedio de evaluacion de esta peli es: " + mediaEvaluar/3);
        
    }
}
