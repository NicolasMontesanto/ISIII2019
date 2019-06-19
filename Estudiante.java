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
public class Estudiante extends Persona {
    private String sitclase;


    public Estudiante(String sitclase) {
        this.sitclase = sitclase;
    }

    public String getSitclase() {
        return sitclase;
    }

    public void setSitclase(String sitclase) {
        this.sitclase = sitclase;
    }
    
}
