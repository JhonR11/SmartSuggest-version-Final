package Entidades.TXTCreate;

import Persistencia.Procesador;
import Logica.LogicaProcesador;
import Entidades.IProcesador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TXTProcesador implements IProcesador {

    private File archivo;
    private FileWriter archivoEscritura;
    private Scanner archivoLectura;

    public TXTProcesador() {
        this("fileTXT/Procesadores.txt");
    }

    public TXTProcesador(String filename) {
        this.archivo = new File(filename);
    }

    public void crearArchivoTexto() {
        this.archivo = new File("fileTXT/Procesadores.txt");
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

    public Procesador getDataFromFile(String Datos[]) {
        Procesador pLeida;
        String socket = String.valueOf(Datos[0]);
        String serie = String.valueOf(Datos[1]);
        String referencia = String.valueOf(Datos[2]);
        String generacion = String.valueOf(Datos[3]);
        String gama = String.valueOf(Datos[4]);

        pLeida = new Procesador(socket, serie, referencia, generacion, gama);
        return pLeida;
    }

    @Override
    public void agregarProcesador(Procesador p) {
        PrintWriter pw = null;
        try {
            this.archivoEscritura = new FileWriter(this.archivo, true);
            pw = new PrintWriter(this.archivoEscritura);
            pw.println(p.getDataForFileTXT());
        } catch (IOException ioe) {
            throw new IllegalStateException("Error al abrir archivo, o no existe");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    @Override
    public ArrayList<Procesador> obtenerProcesadores() {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            ArrayList<Procesador> listaLeida = new ArrayList<>();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                Procesador procesadorLeido = this.getDataFromFile(Datos);
                listaLeida.add(procesadorLeido);
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
    public Procesador buscarProcesador(String referencia) {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            Procesador arcLeido = new Procesador();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                arcLeido = this.getDataFromFile(Datos);
            }
            return arcLeido;
        } catch (FileNotFoundException fnfe) {
            throw new IllegalStateException("El archivo no se puede leer o no existe");
        } finally {
            if (this.archivoLectura != null) {
                this.archivoLectura.close();
            }
        }
    }

    @Override
    public void reemplazarProcesador(String referencia, Procesador p) {
        ArrayList<Procesador> aux = new ArrayList<>();
        LogicaProcesador logArchivoAux = new LogicaProcesador();

        aux = logArchivoAux.consultarProcesadores();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getReferencia().equals(referencia)) {
                aux.set(i, p);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Procesador arcAux = new Procesador(aux.get(i).getSocket(), aux.get(i).getSerie(), aux.get(i).getReferencia(), aux.get(i).getGeneracion(), aux.get(i).getGama());
            agregarProcesador(arcAux);
        }
    }

    @Override
    public void eliminarProcesador(String referencia) {
        ArrayList<Procesador> aux = new ArrayList<>();
        LogicaProcesador logArchivoAux = new LogicaProcesador();

        aux = logArchivoAux.consultarProcesadores();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getReferencia().equals(referencia)) {
                aux.remove(i);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Procesador arcAux = new Procesador(aux.get(i).getSocket(), aux.get(i).getSerie(), aux.get(i).getReferencia(), aux.get(i).getGeneracion(), aux.get(i).getGama());
            agregarProcesador(arcAux);
        }
    }
}
