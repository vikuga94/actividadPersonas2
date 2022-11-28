package com.mycompany.actividadpersonas2;

import java.util.Scanner;

public class Arreglo {

    private Persona personas[];
    private int tamanio;

    public int getTamanio() {
        return tamanio;
    }

    public static int ingresoInt() {
        int entero = 0;
        boolean bandera = true;

        do {
            Scanner entradaUsuario = new Scanner(System.in);
            try {
                entero = entradaUsuario.nextInt();
                bandera = false;

            } catch (java.util.InputMismatchException ex) {
                System.out.println("Error!!" + "\n Por favor ingrese un numero");
            }

        } while (bandera);

        return entero;
    }

    public Arreglo() {

        System.out.println("Ingrese el numero de personas que desea crear: ");
        tamanio = Arreglo.ingresoInt();

        if (tamanio < 0) {
            System.out.println("Error el tamanio debe ser un numero positivo");
        } else if (tamanio == 1) {

            Persona personas[] = new Persona[tamanio];

            System.out.println("ingrese el nombre de la persona: ");
            Scanner entrada = new Scanner(System.in);
            String nombre = entrada.nextLine();
            System.out.println("ingrese el nombre de la persona: ");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese el genero");
            boolean bandera = true;
            boolean genero = false;

            do {
                System.out.println("Seleccione el genero \n"
                        + "1.Masculino\n"
                        + "2.Femenino");
                Scanner input = new Scanner(System.in);

                try {
                    switch (input.nextInt()) {
                        case 1:
                            genero = true;
                            bandera = false;
                            break;

                        case 2:
                            genero = false;
                            bandera = false;
                            break;
                        default:
                            System.out.println("La opcion ingresada no corresponde a ningun genero\n"
                                    + "Por favor seleccione una opcion del listado");

                    }
                } catch (java.util.InputMismatchException ex) {
                    System.out.println("Error!!\n"
                            + "Por favor ingrese un numero");
                }

            } while (bandera);
            System.out.println("Ingrese la edad: ");
            int edad = Arreglo.ingresoInt();
            System.out.println("Ingrese la estatura en cm (valor entero)");
            int estatura = Arreglo.ingresoInt();
            System.out.println("Ingrese el peso en kg (valor entero)");
            int peso = Arreglo.ingresoInt();

            Persona p = new Persona(nombre, apellido, edad, genero, estatura, peso);

            personas[0] = p;
            this.personas = personas;

        } else {
            Persona personas[] = new Persona[tamanio];

            for (int i = 0; i < personas.length; i++) {
                System.out.println("Datos Persona " + (i + 1));

                System.out.println("ingrese el nombre de la persona: ");
                Scanner entrada = new Scanner(System.in);
                String nombre = entrada.nextLine();
                System.out.println("ingrese el apelllido de la persona: ");
                String apellido = entrada.nextLine();
                System.out.println("Ingrese el genero");
                boolean genero = false;

                boolean bandera = true;

                do {
                    System.out.println("Seleccione el genero \n"
                            + "1.Masculino\n"
                            + "2.Femenino");
                    Scanner input = new Scanner(System.in);

                    try {
                        switch (input.nextInt()) {
                            case 1:
                                genero = true;
                                bandera = false;
                                break;

                            case 2:
                                genero = false;
                                bandera = false;
                                break;
                            default:
                                System.out.println("La opcion ingresada no corresponde a ningun genero\n"
                                        + "Por favor seleccione una opcion del listado");

                        }
                    } catch (java.util.InputMismatchException ex) {
                        System.out.println("Error!!\n"
                                + "Por favor ingrese un numero");
                    }

                } while (bandera);
                System.out.println("Ingrese la edad: ");
                int edad = Arreglo.ingresoInt();
                System.out.println("Ingrese la estatura en cm (valor entero)");
                int estatura = Arreglo.ingresoInt();
                System.out.println("Ingrese el peso en kg (valor entero)");
                int peso = Arreglo.ingresoInt();

                Persona p = new Persona(nombre, apellido, edad, genero, estatura, peso);

                personas[i] = p;
                this.personas = personas;

            }

        }
    }
//Retorne el nombre de cada persona.

    public String consultaNombre(int indice) {
        String nombre = personas[indice].getNombre();
        return nombre;
    }
//Retorne el Apellido de cada persona.

    public String consultaApellido(int indice) {
        String apellido = personas[indice].getApellido();
        return apellido;
    }
//Retorne la edad de cada persona.

    public int consultaEdad(int indice) {
        int edad = personas[indice].getEdad();
        return edad;
    }
//Retorne el género de cada persona.

    public boolean consultaGenero(int indice) {
        boolean genero = personas[indice].isGenero();
        return genero;
    }
//Retorne la estatura de cada persona.

    public int consultaEstatura(int indice) {
        int estatura = personas[indice].getEstatura();
        return estatura;
    }
//Retorne la peso de cada persona.

    public int consultaPeso(int indice) {
        int peso = personas[indice].getPeso();
        return peso;
    }
//Retorne todos los atributos de la persona.

    public Persona consultaAtrubutos(int indice) {
        String nombre = personas[indice].getNombre();
        String apellido = personas[indice].getApellido();
        int edad = personas[indice].getEdad();
        boolean genero = personas[indice].isGenero();
        int estatura = personas[indice].getEstatura();
        int peso = personas[indice].getPeso();
        return new Persona(nombre, apellido, edad, genero, estatura, peso);
    }
//Determine cuál es la persona con mayor peso.

    public String mayorPeso() {
        int mayor = -2147483647;
        int indice = 0;
        for (int i = 0; i < personas.length; i++) {
            int peso = personas[i].getPeso();
            if (peso > mayor) {
                mayor = peso;
                indice = i;
            }

        }
        String elMayor = "La persona con mayor peso es " + personas[indice].getNombre();
        return elMayor;
    }
    
//Determine cuál es la persona con menor estatura.

    public String menorEstatura() {
        int menor = 2147483647;
        int indice = 0;
        for (int i = 0; i < personas.length; i++) {
            int estatura = personas[i].getEstatura();
            if (estatura < menor) {
                menor = estatura;
                indice = i;
            }

        }
        String elMenor = "La persona con menor estatura es " + personas[indice].getNombre();
        return elMenor;
    }

}