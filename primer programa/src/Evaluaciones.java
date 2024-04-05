import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluar = 0;
        double totalEvaluar = 0;

        while (nota != -1) {
            System.out.println("Nota que le das a la peli, Marley y yo:");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaEvaluar += nota;
                totalEvaluar++;
            }

        }
        System.out.println("La promedio de evaluacion de esta peli es: " + mediaEvaluar/3);
    }
}
