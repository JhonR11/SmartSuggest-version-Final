package Persistencia;

public class TarjetaGrafica {

    private static int nid;
    private int ID;
    private String nombre;
    private String modelo;
    private String VRam;
    private String tipoMemoria;
    private boolean alimentacionExterna;
    private String pines;
    private int procesador;

    private int consumo; // sumarle +100
    private String puerto;
    private String gama;

    private String img;

    public TarjetaGrafica() {
    }

    public TarjetaGrafica(int ID, String nombre, String modelo, String VRam, String tipoMemoria, int consumo, boolean alimentacionExterna, String pines, String puerto, int procesador, String gama, String img) {
        this.ID = ID;
        this.nombre = nombre;
        this.modelo = modelo;
        this.VRam = VRam;
        this.tipoMemoria = tipoMemoria;
        this.consumo = consumo;
        this.alimentacionExterna = alimentacionExterna;
        this.pines = pines;
        this.puerto = puerto;
        this.procesador = procesador;
        this.gama = gama;
        this.img = img;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVRam() {
        return VRam;
    }

    public void setVRam(String VRam) {
        this.VRam = VRam;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isAlimentacionExterna() {
        return alimentacionExterna;
    }

    public void setAlimentacionExterna(boolean alimentacionExterna) {
        this.alimentacionExterna = alimentacionExterna;
    }

    public String getPines() {
        return pines;
    }

    public void setPines(String pines) {
        this.pines = pines;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TarjetaGrafica{");
        sb.append("ID=").append(ID);
        sb.append(", nombre=").append(nombre);
        sb.append(", modelo=").append(modelo);
        sb.append(", VRam=").append(VRam);
        sb.append(", tipoMemoria=").append(tipoMemoria);
        sb.append(", alimentacionExterna=").append(alimentacionExterna);
        sb.append(", pines=").append(pines);
        sb.append(", procesador=").append(procesador);
        sb.append(", consumo=").append(consumo);
        sb.append(", puerto=").append(puerto);
        sb.append(", gama=").append(gama);
        sb.append(", img=").append(img);
        sb.append('}');
        return sb.toString();
    }

    public String getDataForFileTxt() {
        return String.format("%d;%s;%s;%s;%s;%d;%b;%s;%s;%d;%s;%s",
                this.getID(),
                this.getNombre(),
                this.getModelo(),
                this.getVRam(),
                this.getTipoMemoria(),
                this.getConsumo(),
                this.isAlimentacionExterna(),
                this.getPines(),
                this.getPuerto(),
                this.getProcesador(),
                this.getGama(),
                this.getImg()
        );
    }
}
