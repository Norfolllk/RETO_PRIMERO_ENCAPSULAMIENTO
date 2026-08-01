package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado c1 = new Cuadrado();
		c1.lado = 4;

		double areaC1;
		areaC1 = c1.calcularArea();
		System.out.println("Área cuadrado 1: " + areaC1);

		double perimetroC1;
		perimetroC1 = c1.calcularPerimetro();
		System.out.println("Perímetro cuadrado 1: " + perimetroC1);

		Cuadrado c2 = new Cuadrado();
		c2.lado = 6;

		double areaC2;
		areaC2 = c2.calcularArea();
		System.out.println("Área cuadrado 2: " + areaC2);

		double perimetroC2;
		perimetroC2 = c2.calcularPerimetro();
		System.out.println("Perímetro cuadrado 2: " + perimetroC2);

		Cuadrado c3 = new Cuadrado();
		c3.lado = 3;

		double areaC3;
		areaC3 = c3.calcularArea();
		System.out.println("Área cuadrado 3: " + areaC3);

		double perimetroC3;
		perimetroC3 = c3.calcularPerimetro();
		System.out.println("Perímetro cuadrado 3: " + perimetroC3);

	}

}