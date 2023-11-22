package Entidades.TXTCreate;

import Persistencia.Fuente;
import Logica.LogicaFuente;
import Entidades.IFuente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TXTFuente implements IFuente {

    private File archivo;
    private FileWriter archivoEscritura;
    private Scanner archivoLectura;

    public TXTFuente() {
        this("fileTXT/Fuentes.txt");
    }

    public TXTFuente(String filename) {
        this.archivo = new File(filename);
    }

    public void crearArchivoTexto() {
        this.archivo = new File("fileTXT/Fuentes.txt");
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

    public Fuente getDataFromFile(String Datos[]) {
        Fuente fLeida;
        int capacidad = Integer.parseInt(Datos[0]);
        fLeida = new Fuente(capacidad);
        return fLeida;
    }

    @Override
    public void agregarFuente(Fuente f) {
        PrintWriter pw = null;
        try {
            this.archivoEscritura = new FileWriter(this.archivo, true);
            pw = new PrintWriter(this.archivoEscritura);
            pw.println(f.getDataForFileTXT());
        } catch (IOException ioe) {
            throw new IllegalStateException("Error al abrir archivo, o no existe");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    @Override
    public ArrayList<Fuente> obtenerFuentes() {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            ArrayList<Fuente> listaLeida = new ArrayList<>();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                Fuente fuenteLeida = this.getDataFromFile(Datos);
                listaLeida.add(fuenteLeida);
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
    public Fuente buscarFuente(int capacidad) {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            Fuente fuenteLeida = new Fuente();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                fuenteLeida = this.getDataFromFile(Datos);
            }
            return fuenteLeida;
        } catch (FileNotFoundException fnfe) {
            throw new IllegalStateException("El archivo no se puede leer o no existe");
        } finally {
            if (this.archivoLectura != null) {
                this.archivoLectura.close();
            }
        }
    }

    @Override
    public void reemplazarFuente(int capacidad, Fuente f) {
        ArrayList<Fuente> aux = new ArrayList<>();
        LogicaFuente logArchivoAux = new LogicaFuente();

        aux = logArchivoAux.consultarFuentes();

        for (int i = 0; i < aux.size(); i++) {

            if (aux.get(i).getCapacidad() == capacidad) {
                aux.set(i, f);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Fuente fuenteAux = new Fuente(aux.get(i).getCapacidad());
            agregarFuente(fuenteAux);
        }
    }

    @Override
    public void eliminarFuente(int capacidad) {
        ArrayList<Fuente> aux = new ArrayList<>();
        LogicaFuente logArchivoAux = new LogicaFuente();

        aux = logArchivoAux.consultarFuentes();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getCapacidad() == capacidad) {
                aux.remove(i);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            Fuente fuenteAux = new Fuente(aux.get(i).getCapacidad());
            agregarFuente(fuenteAux);
        }
    }
}
