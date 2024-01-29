/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticaprogramada1;

import java.util.Date;
/**
 *
 * @author alext
 */
public class Estudiante {
    // Aqui se agregan los atributos que el trabajo me solicita
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private int fechaDeNacimiento;
    private int[] nota;
    
    // aqui cree un constructor debido a que lo nesecito para los datos 
    public Estudiante(String primerApellido, String segundoApellido, String nombre, int fechaDeNacimiento) {
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        
    }
    // aqui cree los getters y setters para mis atributos
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }
    //aqui creo un metodo para saber las materia aprobadas y reprobadas de los alumnos  
     public void   Materias() {
        int materiasApro = MateriasAprobadas();
        int materiasRepro = nota.length - materiasApro;
        double porcentajeApro = (double) materiasApro / nota.length * 100;
        double porcentajeRepro = (double) materiasRepro / nota.length * 100;

        System.out.println("Cantidad de  aprobadas: " + materiasApro);
        System.out.println("Cantidad de  reprobadas: " + materiasRepro);
        System.out.println("Porcentaje de  aprobadas: " + porcentajeApro + "%");
        System.out.println("Porcentaje de  reprobadas: " + porcentajeRepro + "%");
    }
     private int MateriasAprobadas() {
        return MateriasAprobadas(nota, 0);
    }

    private int MateriasAprobadas(int[] nota, int index) {
        if (index >= nota.length) {
            return 0;
        }

        int notas = nota[index];
        if (notas > 70) {
            return 1 + MateriasAprobadas(nota, index + 1);
        } else {
            return MateriasAprobadas(nota, index + 1);
        }
    }
}
