package Entidades;

import Persistencia.Procesador;
import java.util.ArrayList;

public interface IProcesador {
    public void agregarProcesador(Procesador p);
    public ArrayList<Procesador> obtenerProcesadores();
    public Procesador buscarProcesador(String referencia);
    public void eliminarProcesador(String referencia);
    public void reemplazarProcesador(String referencia, Procesador p);
}
