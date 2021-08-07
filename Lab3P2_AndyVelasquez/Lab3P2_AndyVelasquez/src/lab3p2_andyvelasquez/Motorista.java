package lab3p2_andyvelasquez;

public class Motorista extends Programador {

    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private int id;
    private String puesto;
    private int anos;
    private int base;
    private String Comision;
    private String Medio;
    private int can;

    public Motorista() {
        super();
    }

    public Motorista(String usuario1, String contra1, String nombre1, String apellido1, int id1, String puesto1, int anos1, int base1, String Comision, String Medio, int can, String usuario, String contra, String nombre, String apellido, int id, String puesto, int anos, int base, String lengua, int hora) {
        super(usuario, contra, nombre, apellido, id, puesto, anos, base, lengua, hora);
        this.usuario = usuario1;
        this.contra = contra1;
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.id = id1;
        this.puesto = puesto1;
        this.anos = anos1;
        this.base = base1;
        this.Comision = Comision;
        this.Medio = Medio;
        this.can = can;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    public String getMedio() {
        return Medio;
    }

    public void setMedio(String Medio) {
        this.Medio = Medio;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
     public String toString() {
        return "Motoristai{" + "Nombre=" + nombre + ", Apellido=" + apellido+ ", Id=" + id +", Puesto "+puesto+", Anos de espericiencia "+ anos +", Sueldo "+base+"Comisiones"+Comision+"Medio de tramsporte"+Medio+", Usuario "+usuario+", Contrasena "+contra+ '}';
    }

}
