package Entidades;

import Persistencia.TarjetaGrafica;
import java.util.ArrayList;

public interface ITarjeta {
    public void agregarTarjeta(TarjetaGrafica tg);
    public ArrayList<TarjetaGrafica> obtenerTarjetas();
    public TarjetaGrafica buscarTarjeta(String nom);
    public void eliminarTarjeta(int ID);
    public void reemplazarTarjeta(int ID, TarjetaGrafica tg);
}

