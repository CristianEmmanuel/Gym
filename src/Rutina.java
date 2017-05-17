import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class Rutina {

    private ArrayList<TipoSerie> rutinaLunes;
    private ArrayList<Rutina> rutinaNueva;

    public Rutina(String s, String s1) {
        this.rutinaNueva = this.hacerRutina();
    }

    private ArrayList<Rutina> hacerRutina() {

        ArrayList<String> piramidal = new ArrayList<>();
        piramidal.add(" 1 x 10");
        piramidal.add(" 1 x 15");
        piramidal.add(" 1 x 18");
        piramidal.add(" 1 x 20");

        ArrayList<String> serie21 = new ArrayList<>();
        serie21.add(" 1 x 7");
        serie21.add(" 1 x 7");
        serie21.add(" 1 x 7");

        ArrayList<String> gigante = new ArrayList<>();
        gigante.add(" 1 x 15");
        gigante.add(" 1 x 18");
        gigante.add(" 1 x 20");
        gigante.add(" 1 x 18");
        gigante.add(" 1 x 15");

        ArrayList<String> pierna = new ArrayList<>();
        pierna.add(" Cuadriceps");
        pierna.add(" Sentadilla");
        pierna.add(" Isquiotiviales");
        pierna.add(" Aductores");
        pierna.add(" Gemelos");

        ArrayList<Rutina> rutinaLunes = new ArrayList<>();

        for (int p = 0; p < pierna.size(); p++) {
            System.out.print(pierna.get(p));

            for (int j = 0; j < gigante.size(); j++) {

                System.out.print(gigante.get(j));
            }
        }

        return rutinaLunes;
    }

   public String getRutinaNueva() {
        ArrayList<Rutina> RutinaNueva = new ArrayList<>();
        return toString();
    }
    // return rutinaNueva;
    //return rutinaNueva;


    private ArrayList<Rutina> grupoMuscular() {

        return rutinaNueva;
    }
}
