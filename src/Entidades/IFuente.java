package Entidades;

import Persistencia.Fuente;
import java.util.ArrayList;

public interface IFuente {
    public void agregarFuente(Fuente f);
    public ArrayList<Fuente> obtenerFuentes();
    public Fuente buscarFuente(int capacidad);
    public void eliminarFuente(int capacidad);
    public void reemplazarFuente(int capacidad, Fuente f);
}
