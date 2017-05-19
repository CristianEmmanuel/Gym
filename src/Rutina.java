import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class Rutina {

    private ArrayList<Void> nuevaSerie;
    private ArrayList<Musculo> tipoDeMusculo;
    private TipoSerie hacerRutina;


    public Rutina() {
        this.hacerRutina = hacerRutina;
        this.nuevaSerie = new ArrayList<Void>();
        this.tipoDeMusculo = new ArrayList<>();
    }



    private void nuevaSerie() {

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

       // return nuevaSerie();
    }

    public ArrayList<Musculo> getTipoDeMusculo() {
        return tipoDeMusculo;
    }

    public ArrayList<Void> getNuevaSerie() {
        return nuevaSerie;
    }

    public void descansar(){

    }

}
