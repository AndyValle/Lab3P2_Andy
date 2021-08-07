/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_andyvelasquez;

/**
 *
 * @author PERSONAL
 */
public class Programador {
    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private int id ;
    private String puesto;
    private int anos;
    private int base;
    private String lengua;
    private int hora;
 public Programador(){
        
    }
    public Programador(String usuario, String contra, String nombre, String apellido, int id, String puesto, int anos, int base, String lengua, int hora) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.puesto = puesto;
        this.anos = anos;
        this.base = base;
        this.lengua = lengua;
        this.hora = hora;
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

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
     public String toString() {
        return "Admi{" + "Nombre=" + nombre + ", Apellido=" + apellido+ ", Id=" + id +", Puesto "+puesto+", Anos de espericiencia "+ anos +", Sueldo "+base+"Lengua de programacion que domina"+lengua+"Horade trabajo"+hora+", Usuario "+usuario+", Contrasena "+contra+ '}';
    }
     
}
