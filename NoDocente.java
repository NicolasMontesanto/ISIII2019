/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej1;

import java.util.Date;

/**
 *
 * @author Luciano
 */
public class NoDocente extends Empleado {
    private String titulo;

    public NoDocente(String titulo, double sueldo, Date fechacontr) {
        super(sueldo, fechacontr);
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
