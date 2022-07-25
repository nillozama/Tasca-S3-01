package Nivell_1_1;

import java.util.Scanner;

public class Principal31 {
	
	public static void main (String args[]) {
		
		boolean loop=true;
		String string;
		Scanner sc=new Scanner(System.in);
		Undo undo=Undo.getUndo();
				
		do {
			
			System.out.println("\n ****Introdueix comanda (màxim 10 comandes)****\n\n Introdueix la paraula i prem intro per guardar.\n Escriu esc, per sortir. "
					+ "\n Escriu delete, per eliminar l'última comanda. \n Escriu print, per mostrar totes les comandes introduides.");
			string=sc.nextLine();
			
			switch(string.toLowerCase()) {
			
			case "esc":
				
				loop=false;
				break;
				
			case "print":
				
				undo.showList();
				break;
				
			case "delete":
				
				undo.deleteLastString();
				break;
				
			default:
				
				undo.addStringToList(string);
			
			}
			
		}while(loop);
		
		System.out.println("Gracies per utilitzar l'aplicació. Adeu!!");
		sc.close();
	}
}
