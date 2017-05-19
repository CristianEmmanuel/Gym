import java.util.ArrayList;

/**
 * Created by cristian on 17/05/17.
 */
public class Musculo {

    private String pierna;
    private String pecho;
    private String espalda;
    private String hombro;
    private String biceps;
    private String triceps;
    private String abdomen;

    public Musculo(String pierna, String pecho, String espalda, String hombro, String biceps, String triceps, String abdomen) {
        this.pierna = pierna;
        this.pecho = pecho;
        this.espalda = espalda;
        this.hombro = hombro;
        this.biceps = biceps;
        this.triceps = triceps;
        this.abdomen = abdomen;
    }

    public String getPierna() {
        return pierna;
    }

    public void setPierna(String pierna) {
        this.pierna = pierna;
    }

    public String getPecho() {
        return pecho;
    }

    public void setPecho(String pecho) {
        this.pecho = pecho;
    }

    public String getEspalda() {
        return espalda;
    }

    public void setEspalda(String espalda) {
        this.espalda = espalda;
    }

    public String getHombro() {
        return hombro;
    }

    public void setHombro(String hombro) {
        this.hombro = hombro;
    }

    public String getBiceps() {
        return biceps;
    }

    public void setBiceps(String biceps) {
        this.biceps = biceps;
    }

    public String getTriceps() {
        return triceps;
    }

    public void setTriceps(String triceps) {
        this.triceps = triceps;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

}
