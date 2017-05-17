/**
 * Created by cristian on 17/05/17.
 */
public class TipoSerie {

    public TipoSerie piramidal;

    public class tipoSerie {
        private String repeticion;
        private String series;
        public tipoSerie(String repeticion, String series) {
            this.repeticion = repeticion;
            this.series = series;
        }
        public String getRepeticion() {
            return repeticion;
        }
        public void setRepeticion(String repeticion) {
            this.repeticion = repeticion;
        }
        public String getSeries() {
            return series;
        }
        public void setSeries(String series) {
            this.series = series;
        }
        @Override
        public String toString() {
            return "Serie{" + "repeticion ='" + repeticion + '\'' + ", grupo muscular ='" + series + '\'' + '}'+"\n";
        }
    }
}
