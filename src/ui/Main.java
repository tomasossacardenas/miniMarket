package ui;

import java.io.IOException;
import java.util.Scanner;

import exceptions.MinorException;
import exceptions.PicoCedulaException;
import model.MiniMarket;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static MiniMarket miniMarket;

	public static void main(String[] args) throws IOException {
	    
		miniMarket= new MiniMarket();
		int day;
		boolean salir=false;
		
		System.out.println("Ingrese el numero del día de hoy");
		day=Integer.parseInt(sc.nextLine());
		
		while(salir==false) {
			String menuMessage="Ingrese el numero de la opcion a realizar \n"+
					"1. Registrar Ingreso de una persona\n"+
					"2. Cantidad de personas que han intentado ingresar al mini mercado\n"+
					"3. Salir del programa";

			System.out.println(menuMessage);
			String eleccion=sc.nextLine();

			if(eleccion.equals("1")) {
				System.out.println("Cual es el tipo de documento de la persona \n"+
						"1. CC \n"+
						"2. TI \n"+
						"3. PP \n"+
						"4. CE ");
				String idType= sc.nextLine();
				System.out.println("Ingrese el numero del documento");
				String idNumber= sc.nextLine();

				try {
					miniMarket.addPerson(miniMarket.returnIdType(idType),idNumber, day);
					System.out.println("El cliente fue agregado al mini mercado.");
				} catch (MinorException e) {
					System.err.println(e.getMessage());
				} catch (PicoCedulaException e) {
					System.err.println(e.getMessage());
				}
			}
			else if(eleccion.equals("2")) {
				System.out.println("La cantidad de personas que han intentado entrar al mini mercado fue: "+miniMarket.getQuantityOfPeople());
			}
			else if(eleccion.equals("3")) {
				salir=true;
			}
			else {
				System.out.println("No escogiste una opción valida");
			}
		}
		

	}
	

}
