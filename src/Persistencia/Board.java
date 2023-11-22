package Persistencia;

public class Board {

    private String tipo;
    private String socket;
    private String puerto;

    public Board() {
    }

    public Board(String tipo, String socket, String puerto) {
        this.tipo = tipo;
        this.socket = socket;
        this.puerto = puerto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Board{");
        sb.append("tipo=").append(tipo);
        sb.append(", socket=").append(socket);
        sb.append(", puerto=").append(puerto);
        sb.append('}');
        return sb.toString();
    }

    public String getDataForFileTXT() {
        return String.format("%s;%s;%s", this.tipo, this.socket, this.puerto);
    }
}
