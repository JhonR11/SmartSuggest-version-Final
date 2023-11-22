package Entidades.TXTCreate;

import Persistencia.Board;
import Logica.LogicaBoard;
import Entidades.IBoard;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TXTBoard implements IBoard {

    private File archivo;
    private FileWriter archivoEscritura;
    private Scanner archivoLectura;

    public TXTBoard() {
        this("fileTXT/Boards.txt");
    }

    public TXTBoard(String fileName) {
        this.archivo = new File(fileName);
    }

    public void crearArchivoTexto() {
        this.archivo = new File("fileTXT/Boards.txt");
        try {
            if (this.archivo.createNewFile()) {
                System.out.println("Archivo creado con Exito.");
            } else {
                if (this.archivo.exists()) {
                    System.out.println("El archivo ya ha sido creado");
                } else {
                    System.out.println("Error al crear archivo.");
                }
            }

        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        }
    }

    public void eliminarArchivoTexto() {
        if (this.archivo.delete()) {
            System.out.println("Archivo eliminado con Exito.");
        } else {
            System.out.println("Error al eliminar archivo.");
        }
    }

    public Board getDataFromFile(String Datos[]) {
        Board bLeida;
        String tipo = String.valueOf(Datos[0]);
        String socket = String.valueOf(Datos[1]);
        String puerto = String.valueOf(Datos[2]);

        bLeida = new Board(tipo, socket, puerto);
        return bLeida;
    }

    @Override
    public void agregarBoard(Board b) {
        PrintWriter pw = null;
        try {
            this.archivoEscritura = new FileWriter(this.archivo, true);
            pw = new PrintWriter(this.archivoEscritura);
            pw.println(b.getDataForFileTXT());
        } catch (IOException ioe) {
            throw new IllegalStateException("Error al abrir archivo, o no existe");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    @Override
    public ArrayList<Board> obtenerBoard() {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            ArrayList<Board> listaLeida = new ArrayList<>();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                Board boardLeida = this.getDataFromFile(Datos);
                listaLeida.add(boardLeida);
            }
            return listaLeida;
        } catch (FileNotFoundException fne) {
            throw new IllegalStateException("El archivo no se puede leer o no existe");
        } finally {
            if (this.archivoLectura != null) {
                this.archivoLectura.close();
            }
        }
    }

    @Override
    public Board buscarBoard(String pueto) {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            Board boardLeido = new Board();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                boardLeido = this.getDataFromFile(Datos);
            }
            return boardLeido;
        } catch (FileNotFoundException fnfe) {
            throw new IllegalStateException("El archivo no se puede leer o no existe");
        } finally {
            if (this.archivoLectura != null) {
                this.archivoLectura.close();
            }
        }
    }

    @Override
    public void reemplazarBoard(String socket, Board b) {
        ArrayList<Board> aux = new ArrayList<>();
        LogicaBoard logArchivoAux = new LogicaBoard();

        aux = logArchivoAux.consultarBoards();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getSocket().equals(socket)) {
                aux.set(i, b);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Board boardAux = new Board(aux.get(i).getTipo(), aux.get(i).getSocket(), aux.get(i).getPuerto());
            agregarBoard(boardAux);
        }
    }

    @Override
    public void eliminarBoard(String socket) {
        ArrayList<Board> aux = new ArrayList<>();
        LogicaBoard logArchivoAux = new LogicaBoard();

        aux = logArchivoAux.consultarBoards();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getSocket().equals(socket)) {
                aux.remove(i);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Board boardAux = new Board(aux.get(i).getTipo(), aux.get(i).getSocket(), aux.get(i).getPuerto());
            agregarBoard(boardAux);
        }
    }
}
