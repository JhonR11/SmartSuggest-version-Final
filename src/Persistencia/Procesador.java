package Persistencia;

public class Procesador {

    private String socket;
    private String serie;
    private String referencia;
    private String generacion;
    private String gama;

    public Procesador() {
    }

    public Procesador(String socket, String serie, String referencia, String generacion, String gama) {
        this.socket = socket;
        this.serie = serie;
        this.referencia = referencia;
        this.generacion = generacion;
        this.gama = gama;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Procesador{");
        sb.append("socket=").append(socket);
        sb.append(", serie=").append(serie);
        sb.append(", referencia=").append(referencia);
        sb.append(", generacion=").append(generacion);
        sb.append(", gama=").append(gama);
        sb.append('}');
        return sb.toString();
    }

    public String getDataForFileTXT() {
        return String.format("%s%s;%s;%s;%s", this.socket, this.serie, this.referencia, this.generacion, this.gama);
    }
}
