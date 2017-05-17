import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class Rutina {

    private ArrayList<TipoSerie> rutinaLunes;
    private String rutinaNueva;


    public Rutina() {
        this.rutinaLunes = this.hacerRutina();
    }

    private ArrayList<TipoSerie> hacerRutina() {
        ArrayList<String> piramidal = new ArrayList<>();
        piramidal.add("1 x 10");
        piramidal.add("1 x 15");
        piramidal.add("1 x 18");
        piramidal.add("1 x 20");
        ArrayList<String> serie21 = new ArrayList<>();
        serie21.add("1 x 7");
        serie21.add("1 x 7");
        serie21.add("1 x 7");
        ArrayList<String> gigante = new ArrayList<>();
        gigante.add("1 x 15");
        gigante.add("1 x 18");
        gigante.add("1 x 20");
        gigante.add("1 x 18");
        gigante.add("1 x 15");

        ArrayList<TipoSerie> rutinaLunes = new ArrayList<>();

        for (int j = 0; j < gigante.size(); j++) {
            System.out.print(gigante.get(j));

        }

   /* public String getRutinaNueva() {
        ArrayList<TipoSerie> RutinaNueva = new ArrayList<>();
        return toString();
    }*/
        return rutinaLunes;
    }

    public String getRutinaNueva() {
        return rutinaNueva;
    }
}

