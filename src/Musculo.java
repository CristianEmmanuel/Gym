import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class Musculo {

    public Musculo(String pierna) {
        this.pierna = pierna;
    }

    private String pierna;

    public String getPierna() {
        return pierna;
    }

    public void setPierna(String pierna) {
        this.pierna = pierna;
    }

    private ArrayList<String> grupoMuscular(){

        ArrayList<String> pierna = new ArrayList<>();
        pierna.add(" Cuadriceps");
        pierna.add(" Sentadilla");
        pierna.add(" Isquiotiviales");
        pierna.add(" Aductores");
        pierna.add(" Gemelos");

        ArrayList<TipoSerie> rutinaLunes = new ArrayList<>();

        for(int p = 0; p <pierna.size(); p++){
            System.out.print(pierna.get(p));
        }
        return pierna;
    }


}
