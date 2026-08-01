package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();

		System.out.println("--- Valores por defecto v1 ---");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año: " + v1.getAnio());
		System.out.println("Valor: " + v1.getValor());

		v1.setMarca("Toyota");
		v1.setModelo("Corolla");
		v1.setAnio("2023");
		v1.setValor("22000");

		System.out.println("--- Valores después de setear v1 ---");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año: " + v1.getAnio());
		System.out.println("Valor: " + v1.getValor());

	}

}