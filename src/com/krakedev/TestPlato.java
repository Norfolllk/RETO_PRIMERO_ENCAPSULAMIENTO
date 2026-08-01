package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {

        Plato platoA;
        Plato platoB;
        Plato platoC;


        platoA = new Plato();
        platoB = new Plato();
        platoC = new Plato();


        System.out.println("PLATOS ANTES DE ASIGNAR VALORES\n");
        System.out.println("Plato A");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);
        System.out.println();

        System.out.println("Plato B");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);
        System.out.println();

        System.out.println("Plato C");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);

        platoA.nombre = "Ceviche Mixto";
        platoA.tipo = "Entrada";
        platoA.precio = 8.50f;
        platoA.disponible = true;

        platoB.nombre = "Lomo Saltado";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 12.75f;
        platoB.disponible = true;

        platoC.nombre = "Cheesecake";
        platoC.tipo = "Postre";
        platoC.precio = 5.25f;
        platoC.disponible = false;

        System.out.println("\nPLATOS CON VALORES SETEADOS\n");
        System.out.println("Plato A");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);
        System.out.println();

        System.out.println("Plato B");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);
        System.out.println();

        System.out.println("Plato C");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);

    }

}