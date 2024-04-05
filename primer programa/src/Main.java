//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Sea benvenuto a JCROTV!");
        System.out.println("Pelicula: Marley y yo");


        int fechaDeLanza = 2008;
        boolean incluidoEnPlan = true;
        double notaDePeli = 9.2;


        double media = (9.2 + 5.4 + 9.1) / 3;

        String sinopsis = """
                Marley y yo es una pelicula de los 2000's muy triste, 
                Fue lanzada en:
                """ + fechaDeLanza;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }
}