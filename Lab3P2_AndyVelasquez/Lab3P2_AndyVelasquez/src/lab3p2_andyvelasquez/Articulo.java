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
public class Articulo extends Tienda {

    private String nombre2;
    private String cate;
    private int precio;

    public Articulo() {
        super();
    }

    public Articulo(String nombre2, String cate, int precio, String nombre, String ubica, int canti, String tiempo) {
        super ( nombre,ubica,  canti,  tiempo);
        this.nombre2 = nombre2;
        this.cate = cate;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre2;
    }

    public void setNombre(String nombre) {
        this.nombre2 = nombre;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
      @Override
    public String toString() {
        return "Articulos{" + "Nombre=" + nombre2 + ", Categoria=" + cate + ", Precio=" + precio + '}';
    }


}
