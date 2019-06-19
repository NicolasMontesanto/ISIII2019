/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej1;

/**
 *
 * @author Luciano
 */
public abstract class Persona {
    private String nombre;
    private String direccion;
    private String numtel;
    private String email;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String numtel, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numtel = numtel;
        this.email = email;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumtel() {
        return numtel;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        System.out.println("s");
    }
}
