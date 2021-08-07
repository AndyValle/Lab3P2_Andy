
package lab3p2_andyvelasquez;

/**
 *
 * @author PERSONAL
 */
public class Cliente {
    private String usuario;
    private String contra;
    private String nombre;
    private String apellido;
    private int id;
    private String Domicilio;
    private int can;

    public Cliente(String usuario, String contra, String nombre, String apellido, int id, String Domicilio, int can) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.Domicilio = Domicilio;
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

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
       public String toString() {
        return "Cliente{" + "Nombre=" + nombre + ", Apellido=" + apellido+ ", Id=" + id +", Domicilio= "+Domicilio+", Veces que a pedido ala aplicacion "+ can +", Usuario "+usuario+", Contrasena "+contra+ '}';
    }

    
}
