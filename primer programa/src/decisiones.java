public class decisiones {


    public static void main(String[] args) {
        int fechaDeLanza = 2008;
        boolean incluidoEnPlan = false;
        double notaDePeli = 9.2;
        String tipoplan = "plus";

//        if (fechaDeLanza >= 2022) {
//            System.out.println("peliculas mas populares");
//        }else {
//            System.out.println("peliculas retro, miratelas perro");
//        }

        if (incluidoEnPlan && tipoplan.equals("plus")){
            System.out.println("Disfruta parce");
        } else {
            System.out.println("No disponible, tonto");
        }

    }
}
