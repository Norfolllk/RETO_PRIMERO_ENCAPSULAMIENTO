package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {

        Restaurante rest1;
        Restaurante rest2;

        rest1 = new Restaurante();
        rest2 = new Restaurante();

        System.out.println("Restaurantes antes de asignar valores");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion + "\n");

        System.out.println("Restaurantes antes de asignar valores");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

        rest1.nombre = "VacoYVaca";
        rest1.direccion = "El Bosque";
        rest1.calificacion = 4.5f;

        System.out.println("Restaurantes con valores seteados");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);

        rest2.nombre = "Menestras del Negro";
        rest2.direccion = "Av Real Audiencia";
        rest2.calificacion = 3.8f;

        System.out.println("Restaurantes con valores seteados");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

    }

}


//rest1.calificacion=Float.parseFloat("4.5");
//rest1.calificacion=4.5f;