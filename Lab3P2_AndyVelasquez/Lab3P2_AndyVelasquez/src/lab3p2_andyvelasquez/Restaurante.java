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

public class Restaurante {

    private String identi;
    private String ubica;
    private int rtn;
    private String slogan;
    ///////////////////
    private String comida;
    private int id;
    private int precio;
    private int cantida;
    private String tipo;
    private int precioa;

    public Restaurante(String comida, int id, int precio, int cantida, String tipo, int precioa) {
        this.comida = comida;
        this.id = id;
        this.precio = precio;
        this.cantida = cantida;
        this.tipo = tipo;
        this.precioa = precioa;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioa() {
        return precioa;
    }

    public void setPrecioa(int precioa) {
        this.precioa = precioa;
    }

    public Restaurante() {

    }

    public Restaurante(String identi, String ubica, int rtn, String slogan) {
        this.identi = identi;
        this.ubica = ubica;
        this.rtn = rtn;
        this.slogan = slogan;
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getUbica() {
        return ubica;
    }

    public void setUbica(String ubica) {
        this.ubica = ubica;
    }

    public int getRtn() {
        return rtn;
    }

    public void setRtn(int rtn) {
        this.rtn = rtn;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    
     @Override
    public String toString() {
        return "Restaurantes {" + "Nombre=" + identi +
                ", ubicacion=" + ubica + ", RTN=" 
                + rtn + ", Slogan=" + slogan + "\n"+
                "Lista de comidas\n"+
                "Comida="+ comida +"Id="+id+"Precio="+precio+" Cantidad de acompaniamientos "+cantida+" Tipo de adicion="+tipo+" Precio adicional"+precioa+'}';
    }

        
     
}
