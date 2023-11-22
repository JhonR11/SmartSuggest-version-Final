package Entidades.TXTCreate;

import Persistencia.TarjetaGrafica;
import Logica.LogicaTarjeta;
import Entidades.ITarjeta;
import java.io.*;
import java.util.*;

public class TXTTarjetas implements ITarjeta {

    private File archivo;
    private FileWriter archivoEscritura;
    private Scanner archivoLectura;

    public TXTTarjetas() {
        this("fileTXT/Tarjetas.txt");
    }

    public TXTTarjetas(String fileName) {
        this.archivo = new File(fileName);
    }

    public void crearArchivoTexto() {
        this.archivo = new File("fileTXT/Tarjetas.txt");
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

    public TarjetaGrafica getDataFromFile(String Datos[]) {
        TarjetaGrafica tLeida;

        int ID = Integer.parseInt(Datos[0]);
        String nombre = String.valueOf(Datos[1]);
        String modelo = String.valueOf(Datos[2]);
        String VRam = String.valueOf(Datos[3]);
        String tipoMemoria = String.valueOf(Datos[4]);
        int consumo = Integer.parseInt(Datos[5]);
        boolean alimentacionExterna = Boolean.parseBoolean(Datos[6]);
        String pines = String.valueOf(Datos[7]);
        String puerto = String.valueOf(Datos[8]);
        int procesador = Integer.parseInt(Datos[9]);
        String gama = String.valueOf(Datos[10]);
        String img = String.valueOf(Datos[11]);

        tLeida = new TarjetaGrafica(
                ID,
                nombre,
                modelo, VRam, tipoMemoria, consumo, alimentacionExterna, pines, puerto, procesador, gama, img);

        tLeida.setNombre(nombre);
        return tLeida;
    }

    @Override
    public void agregarTarjeta(TarjetaGrafica tg) {
        PrintWriter pw = null;
        try {
            this.archivoEscritura = new FileWriter(this.archivo, true);
            pw = new PrintWriter(this.archivoEscritura);
            pw.println(tg.getDataForFileTxt());
        } catch (IOException ioe) {
            throw new IllegalStateException("Error al abrir archivo, o no existe");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    @Override
    public ArrayList<TarjetaGrafica> obtenerTarjetas() {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            ArrayList<TarjetaGrafica> listaLeida = new ArrayList<>();
            while (this.archivoLectura.hasNext()) {
                String Datos[] = this.archivoLectura.nextLine().split(";");
                TarjetaGrafica tarjetaLeida = this.getDataFromFile(Datos);
                listaLeida.add(tarjetaLeida);
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
    public TarjetaGrafica buscarTarjeta(String nom) {
        try {
            this.archivoLectura = new Scanner(this.archivo);
            TarjetaGrafica arcLeido = new TarjetaGrafica();
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
    public void reemplazarTarjeta(int ID, TarjetaGrafica tg) {
        ArrayList<TarjetaGrafica> aux = new ArrayList<>();
        LogicaTarjeta logArchivoAux = new LogicaTarjeta();

        aux = logArchivoAux.consultarTarjetas();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getID() == ID) {
                aux.set(i, tg);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();

        for (int i = 0; i < aux.size(); i++) {
            TarjetaGrafica arcAux = new TarjetaGrafica(
                    aux.get(i).getID(),
                    aux.get(i).getNombre(),
                    aux.get(i).getModelo(),
                    aux.get(i).getVRam(),
                    aux.get(i).getTipoMemoria(),
                    aux.get(i).getConsumo(),
                    aux.get(i).isAlimentacionExterna(),
                    aux.get(i).getPines(),
                    aux.get(i).getPuerto(),
                    aux.get(i).getProcesador(),
                    aux.get(i).getGama(),
                    aux.get(i).getImg());
            agregarTarjeta(arcAux);
        }
    }

    @Override
    public void eliminarTarjeta(int ID) {
        ArrayList<TarjetaGrafica> aux = new ArrayList<>();
        LogicaTarjeta logArchivoAux = new LogicaTarjeta();

        aux = logArchivoAux.consultarTarjetas();

        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getID() == ID) {
                aux.remove(i);
                break;
            }
        }

        eliminarArchivoTexto();
        crearArchivoTexto();
        int auxiliar = 1;
        for (int i = 0; i < aux.size(); i++) {
            TarjetaGrafica arcAux = new TarjetaGrafica(
                    (auxiliar++),
                    aux.get(i).getNombre(),
                    aux.get(i).getModelo(),
                    aux.get(i).getVRam(),
                    aux.get(i).getTipoMemoria(),
                    aux.get(i).getConsumo(),
                    aux.get(i).isAlimentacionExterna(),
                    aux.get(i).getPines(),
                    aux.get(i).getPuerto(),
                    aux.get(i).getProcesador(),
                    aux.get(i).getGama(),
                    aux.get(i).getImg()
            );
            agregarTarjeta(arcAux);
        }
    }
}
