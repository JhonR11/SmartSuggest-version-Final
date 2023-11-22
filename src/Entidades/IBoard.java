package Entidades;

import Persistencia.Board;
import java.util.ArrayList;

public interface IBoard {

    public void agregarBoard(Board b);
    public ArrayList<Board> obtenerBoard();
    public Board buscarBoard(String puerto);
    public void eliminarBoard(String puerto);
    public void reemplazarBoard(String puerto, Board f);
}
