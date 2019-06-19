/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej1;

import java.util.Date;
public class Empleado extends Persona {
    private double sueldo;
    private Date fechacontr;

    public Empleado(double sueldo, Date fechacontr) {
        this.sueldo = sueldo;
        this.fechacontr = fechacontr;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechacontr() {
        return fechacontr;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechacontr(Date fechacontr) {
        this.fechacontr = fechacontr;
    }
    

}
