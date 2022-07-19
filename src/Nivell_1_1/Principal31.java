package Nivell_1_1;

import java.util.Scanner;

public class Principal31 {
	
	public static void main (String args[]) {
		
		boolean loop=true;
		String string;
		Scanner sc=new Scanner(System.in);
		Undo undo=Undo.getUndo();
				
		do {
			
			System.out.println("Introdueix comanda (màxim 10 comandes). Escriu Esc per sortir, "
					+ "delete per eliminar l'última comanda i print per mostrar totes les comandes introduides.");
			string=sc.nextLine();
			
			switch(string) {
			
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
