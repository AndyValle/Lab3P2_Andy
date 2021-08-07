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
public class Comida extends Restaurante {
    private String comida;
    private int id;
    private int precio;
    private int cantida;
    private String tipo;
    private int precioa;
    public Comida(){
        
    }
    public Comida(String comida, int id, int precio, int cantida, String tipo, int precioa) {
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
    
    
}
