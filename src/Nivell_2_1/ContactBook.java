package Nivell_2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBook {
	
	private static List<Contact> contactBook=new ArrayList <Contact>();
	
	public static void main(String[] args) {
		
		boolean exitMenu=false;
		
		while(!exitMenu) {
			exitMenu=showMenu(exitMenu);
			
		}
	}
	
	public static boolean showMenu(boolean exitMenu) {
		
		System.out.println("Programa gestión tiendas orddenadores.\n \n"
				+ "1.- Mostrar llista de contactes.\r\n"
				+ "\r\n"
				+ "2.- Insertar contacte.\r\n"
				+ "\r\n"
				+ "3.- Eliminar contacte.\r\n"
				+ "\r\n"
				+ "0.- Salir.");
		
		String indexSwitch=requireString("\r\nQue opción del menú quieres escoger?");
		
		switch(indexSwitch) {
		
		case "0":

			System.out.println("Gracies por utilitzar l'aplicació. Adeu!!");
			exitMenu=true;

			break;
			
		case "1":
			
			contactBook.forEach(System.out::println);

			break;
			
		case "2":
			
			addContact();

			break;
			
		case "3":
			
			deleteContact();
			
			break;
				
		default:
			
			System.out.println("Tens que escollir un número de la llista.");
		}
		
		return exitMenu;
	}
	
	public static void addContact() {
		
		ContactFactory contactFactory = null;
		Contact contact;
		String phoneNumber;
		String name;
		String street;
		String number;
		String flat;
		String postalCode;
		String location;
		String country;
		
		name=requireString("Nom i cognoms de contacte.");
		phoneNumber=requireString("Telèfon.");
		street=requireString("Carrer.");
		number=requireString("Número.");
		flat=requireString("Pis.");		
		postalCode=requireString("Codi postal.");
		location=requireString("Localitat.");
		country=requireString("De quin país es el contacte?\nEspanya\nFrança\nAnglaterra").toLowerCase();
		
		switch(country) {
		
		case "espanya":
			
			contactFactory=new SpanishContactFactory();
			break;
			
		case "frança":
			
			contactFactory=new FranceContactFactory();
			break;
			
		case "anglaterra":
			
			contactFactory=new EnglishContactFactory();
			break;
			
		default:
			
			System.out.println("No has agafat una opció correcta");
		}
		
		contact=new Contact(contactFactory, phoneNumber, name, street, number, flat, postalCode, location);
		contactBook.add(contact);
		System.out.println("S´ha creat el contacte;\n"+contact);
	}
	
	public static void deleteContact() {

		contactBook.forEach(System.out::println);
		String name=requireString("\nQuin contacte vols eliminar?? Escriu nom i cognom.");
		contactBook.removeIf(p->p.getName().equals(name));
		System.out.println("S'ha eliminat el contacte.");
	}
	
	public static String requireString(String message) {
		
		Scanner sc=new Scanner(System.in);
		String string="";
		boolean loopOut=false;
		
		do {
			
			System.out.println(message);
			try{
				string=sc.nextLine();
				loopOut=true;
			}catch (Exception e){
				
				System.out.println("No es correcte.");
			}
			
		}while(!loopOut);
		
		return string;
	}
}
