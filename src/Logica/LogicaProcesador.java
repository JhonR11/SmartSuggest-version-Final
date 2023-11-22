package Logica;

import Persistencia.Procesador;
import Entidades.TXTCreate.TXTProcesador;
import Entidades.IProcesador;
import java.util.ArrayList;

public class LogicaProcesador {

    private IProcesador data;

    public LogicaProcesador() {
        this.data = new TXTProcesador();
    }

    public void registrarProcesador(Procesador p) {
        this.data.agregarProcesador(p);
    }

    public ArrayList<Procesador> consultarProcesadores() {
        return this.data.obtenerProcesadores();
    }

    public Procesador buscarProcesador(String ref) {
        Procesador pos = this.data.buscarProcesador(ref);
        return pos;
    }

    public Procesador crearProcesador(String socket, String generacion, String serie, String referencia, String gama) {
        Procesador nuevaTarjeta = new Procesador(socket, generacion, serie, referencia, gama);
        return nuevaTarjeta;
    }
}
