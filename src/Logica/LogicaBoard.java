package Logica;

import Persistencia.Board;
import Entidades.TXTCreate.TXTBoard;
import Entidades.IBoard;
import java.util.ArrayList;

public class LogicaBoard {

    private IBoard data;

    public LogicaBoard() {
        this.data = new TXTBoard();
    }

    public void registrarBoard(Board b) {
        this.data.agregarBoard(b);
    }

    public ArrayList<Board> consultarBoards() {
        return this.data.obtenerBoard();
    }

    public Board buscarBoard(String puerto) {
        Board pos = this.data.buscarBoard(puerto);
        return pos;
    }

    public Board crearBoard(String tipo, String socket, String puerto) {
        Board nuevaBoard = new Board(tipo, socket, puerto);
        return nuevaBoard;
    }
}
