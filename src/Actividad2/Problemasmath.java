package Actividad2;

import java.util.Scanner;

public class Problemasmath {
	public void formula1 () {
		double x;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("√X^5−6/4 \n");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();
		double exponente = Math.pow(x, 5);
		x = exponente - 6;
		double raiz = Math.sqrt(x);
		respuesta = raiz /4;
		
		System.out.print("El resultado de la operacion es: " + respuesta);

	}
	public void formula2 () {
		double x;
		double y;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("x^y - 6^x");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();
		System.out.print("ingrese el valor de y: ");
		y = entrada.nextDouble();
		double exponenteX = Math.pow(x, y);
		double exponenteY = Math.pow(6, x);
		respuesta = exponenteX - exponenteY;
		
		System.out.print("el resultado de la resta es: " + respuesta);
		
		
	}
	public void formula3 () {
		double x;
		double z;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("4cos(z/5)-sinX^2");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();
		System.out.print("ingrese el valor de z: ");
		z = entrada.nextDouble();
		double division = z/5;
		double coseno = Math.cos(division);
		double exponente = Math.pow(x, 2);
		double seno = Math.sin(exponente);
		
		respuesta = 4*coseno - seno;
		System.out.print("el resultado de la operacion es: " + respuesta);
	}
	public void formula4 () {
		double x;
		double y;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("x^4-√6x-y^3 ");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();	
		System.out.print("ingrese el valor de y: ");
		y = entrada.nextDouble();
		double exponenteX = Math.pow(x, 4);
		double exponenteY = Math.pow(y, 3);
		double multiplicacion = 6 * x ;
		double resta = multiplicacion - exponenteY;
		double raiz = Math.sqrt(resta);
		
		respuesta = exponenteX - raiz;
		System.out.print("el resultado de la operacion es: " + respuesta ); 
	}
	public void formula5() {
		double x;
		double y;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("1/y-1/x-2^y ");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();
		System.out.print("ingrese el valor de y: ");
		y = entrada.nextDouble();
		double exponenteY = Math.pow(2, y);
		double resta1 = x - exponenteY;
		double division1 = 1/ resta1;	
		double resta2 = y - division1;
		double division2 = 1/ resta2;
		
		respuesta = division2 - resta2;
		System.out.print("el resultado de la operacion es: " + respuesta);
	}
	public void formula6() {
		double x;
		double respuesta;
		Scanner entrada = new Scanner (System.in);
		System.out.print("7cos√5 - sin√3x-4 ");
		System.out.print("ingrese el valor de x: ");
		x = entrada.nextDouble();
		double multiplicacion1 = (3 * x) - 4;
		double raiz1 = Math.sqrt(multiplicacion1);
		double seno = Math.sin (raiz1);
		double resta = 5 - seno;
		double raiz2 = Math.sqrt(resta);
		double coseno = Math.cos(raiz2);
		double multiplicacion2 = 7 * coseno;
		
		respuesta = multiplicacion2 * coseno;
		System.out.print("el resultado de la operacion es: " + respuesta);
	}
	
}
