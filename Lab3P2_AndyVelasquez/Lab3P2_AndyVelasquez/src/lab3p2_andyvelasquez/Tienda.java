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
public class Tienda {
    private String nombre;
    private String ubica;
    private int canti;
    private String tiempo;
    public Tienda(){
        
    }

    public Tienda(String nombre, String ubica, int canti, String tiempo) {
        this.nombre = nombre;
        this.ubica = ubica;
        this.canti = canti;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbica() {
        return ubica;
    }

    public void setUbica(String ubica) {
        this.ubica = ubica;
    }

    public int getCanti() {
        return canti;
    }

    public void setCanti(int canti) {
        this.canti = canti;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
     @Override
    public String toString() {
        return "Tienda{" + "Nombre=" + nombre+ ", Ubicacion mas cercana=" + ubica + ", Cantidad de personal=" + canti + ", Tiempo de espera para preparacion de articulos=" + tiempo + '}';
    }
}
