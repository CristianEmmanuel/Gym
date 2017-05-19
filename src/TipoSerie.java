import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class TipoSerie {

    private TipoSerie piramidal;
    private TipoSerie serie21;
    private TipoSerie gigante;
    private ArrayList<Musculo> listaDeMusculos;

    public TipoSerie(TipoSerie piramidal, TipoSerie serie21, TipoSerie gigante) {
        this.piramidal = piramidal;
        this.serie21 = serie21;
        this.gigante = gigante;
        this.listaDeMusculos = new ArrayList<>();
    }

    public TipoSerie getPiramidal() {
        return piramidal;
    }

    public void setPiramidal(TipoSerie piramidal) {
        this.piramidal = piramidal;
    }

    public TipoSerie getSerie21() {
        return serie21;
    }

    public void setSerie21(TipoSerie serie21) {
        this.serie21 = serie21;
    }

    public TipoSerie getGigante() {
        return gigante;
    }

    public void setGigante(TipoSerie gigante) {
        this.gigante = gigante;
    }
    public void entrenarMusculo(Musculo musculo){
        this.listaDeMusculos.add(musculo);
    }
    public void descansar(){

    }

    private ArrayList<String> nuevoMusculo(){
        ArrayList<String> pierna = new ArrayList<>();
        pierna.add(" Cuadriceps");
        pierna.add(" Sentadilla");
        pierna.add(" Isquiotiviales");
        pierna.add(" Aductores");
        pierna.add(" Gemelos");
        return nuevoMusculo();
    }

}

