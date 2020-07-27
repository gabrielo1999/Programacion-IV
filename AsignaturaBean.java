/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author win10
 */
@Named(value="asignaturaBean")
@RequestScoped
public class AsignaturaBean 
{
    private String materia;
    private String carrera;
    private String ciclo;
    private String Profesor[];

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String[] getProfesor() {
        return Profesor;
    }

    public void setProfesor(String[] Profesor) {
        this.Profesor = Profesor;
    }
    
    
    
}
