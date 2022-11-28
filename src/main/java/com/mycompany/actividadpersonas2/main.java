package com.mycompany.actividadpersonas2;
/**
 *
 * @author SEvguzman
 */
class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Arreglo lista = new Arreglo();

        //Listar las personas capturadas y cada uno de los atributos.
        for (int i = 0; i < lista.getTamanio(); i++) {

            System.out.println("Persona " + (i + 1));
            System.out.println("\nNombre: " + lista.consultaNombre(i));
            System.out.println("Apellido: " + lista.consultaApellido(i));
            System.out.println("Genero: " + lista.consultaGenero(i));
            System.out.println("Estatura: " + lista.consultaEstatura(i));
            System.out.println("Peso: " + lista.consultaPeso(i));
            System.out.println("Edad: " + lista.consultaEdad(i));

        }

        // Determinar cuál fue la persona con mayor peso.
        System.out.println(lista.mayorPeso());

        //Determinar cuál fue la persona con menor estatura.
        System.out.println(lista.menorEstatura());

        //Informar el promedio de edad de las personas capturadas.
        float sumatoria = 0;
        for (int i = 0; i < lista.getTamanio(); i++) {
            sumatoria = sumatoria + lista.consultaEdad(i);

        }
        float promedio = sumatoria / lista.getTamanio();
        System.out.println("El promedio de las edades es: " + promedio);

        //Informar cuantas personas son del género Masculino y cuantas son del género Femenino de las personas capturadas.
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
