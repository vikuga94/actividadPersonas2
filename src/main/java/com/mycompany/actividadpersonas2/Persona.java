package com.mycompany.actividadpersonas2;
/**
 *
 * @author SEvguzman
 */
/**
 *
 * Definir una clase que permita crear una estructura de datos capaz de
 * almacenar los datos de una persona como lo son el nombre, Apellido, edad,
 * género, estatura y peso. Se debe de guardar esta clase con el nombre de
 * Persona
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean genero;
    private int estatura;
    private int peso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, boolean genero, int estatura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        String texto = "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Edad: " + edad + "\n"
                + "Genero: " + genero + "\n"
                + "Estatura: " + estatura + "\n"
                + "Peso: " + peso;
        return texto;

    }

}

