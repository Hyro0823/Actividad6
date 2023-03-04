import java.util.Scanner;

import java.util.Scanner;

public class Viaje {

	public void personas() {
		try (Scanner entrada = new Scanner(System.in)) {
			int personas = 0;
			int personasA = 0;
			int personasF = 0;
			int autobuses = 0;
			int n = 0;

			System.out.print("¡El Viaje ya esta cerca! \n");
			System.out.print("Ingrese el numero de personas que van a ir: \n");
			personas = entrada.nextInt();

			if (personas >= 45) {
				if (personas == 45) {
					System.out.print("El viaje sera en Autobus por que son 45 personas. \n");
				} 
				if (personas > 45) {
					for(n=personas;n>0;n=n) {
						if(n>45) {
							n=n-45;
							personasA=personasA+45;
							personasF=n;
							autobuses=autobuses+1;
						}
						else {
							n=0;
							System.out.print("La cantidad de autobuses que se necesitan son: "+autobuses+ "\n");
							System.out.print("La cantidad de personas que van a ir en autobus son: "+personasA+ "\n");
							System.out.print("La cantidad de personas que van a ir en furgoneta son: "+personasF+ "\n");
						}
					}
				}
			} else {
				System.out.print("El viaje sera en Furgoneta por que son menos de 45 personas: \n" + personas);
			}
		}
	}
}
