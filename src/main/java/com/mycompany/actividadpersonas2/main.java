package com.mycompany.actividadpersonas2;
/**
 *
 * @author SEvguzman
 */
class main {
    public static void main(String[] args) {

        Arreglo lista = new Arreglo();

        for (int i = 0; i < lista.getTamanio(); i++) {

            System.out.println("Persona " + (i + 1));
            System.out.println("\nNombre: " + lista.consultaNombre(i));
            System.out.println("Apellido: " + lista.consultaApellido(i));
            System.out.println("Genero: " + lista.consultaGenero(i));
            System.out.println("Estatura: " + lista.consultaEstatura(i));
            System.out.println("Peso: " + lista.consultaPeso(i));
            System.out.println("Edad: " + lista.consultaEdad(i));

        }

        System.out.println(lista.mayorPeso());

        System.out.println(lista.menorEstatura());

        float sumatoria = 0;
        for (int i = 0; i < lista.getTamanio(); i++) {
            sumatoria = sumatoria + lista.consultaEdad(i);

        }
        float promedio = sumatoria / lista.getTamanio();
        System.out.println("El promedio de las edades es: " + promedio);

        int masculino = 0;
        int femenino = 0;

        for (int i = 0; i < lista.getTamanio(); i++) {
            if (lista.consultaGenero(i)) {
                masculino++;
            } else {
                femenino++;
            }

        }
        System.out.println("Hay " + masculino + " personas de genero Masculino");
        System.out.println("Hay " + femenino + " personas de genero Femenino");
    }
}
