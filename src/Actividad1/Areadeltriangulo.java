package Actividad1;

import java.util.Scanner;

public class Areadeltriangulo {
	public void areatriangulo() {
		double base;
		double altura;
		double resultado;
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.print("ingresa la base del triangulo: ");
			base = entrada.nextDouble();
			
			System.out.print("ingresa la altura del triangulo: ");
			altura = entrada.nextDouble();
		}
		
		resultado = (base*altura) /2;
		
		System.out.print("El resultado de la superficie del triangulo es: " + resultado);
		
		
	}
	
	
}
