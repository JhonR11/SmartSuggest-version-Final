package Persistencia;

public class Fuente {

    private int capacidad;

    public Fuente() {
    }

    public Fuente(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fuente{");
        sb.append("Capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }

    public String getDataForFileTXT() {
        return String.format("%d", this.capacidad);
    }
}
