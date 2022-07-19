package Nivell_1_1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo undo;
	private static ArrayList<String> stringList=new ArrayList<String>();	
	
	private Undo() {
		
		
	}
	
	public static Undo getUndo() {
		
		
		if(undo==null) {
			
			undo=new Undo();
		}
		return undo;
	}
	
	public void addStringToList(String string) {
		
		//historial de máximo 10 elementos
		if(stringList.size()<10) {
			
			stringList.add(string);
		}
		else {
			
			deleteFirstString();
			stringList.add(string);
		}
	}
	
	public void showList() {
		
		if(stringList.size()!=0) {
			System.out.println("Els "+stringList.size()+" elements de l'historial son:");
			stringList.forEach(System.out::println);
		}
		else {
			
			System.out.println("No hi ha elements a la llista.");
		}
		
	}
	
	public void showLastString() {
		
		System.out.println(stringList.get(stringList.size()-1));
	}
	
	public void deleteLastString() {
		
		if(stringList.size()!=0) {
			
			stringList.remove(stringList.size()-1);
		}
		else {
			
			System.out.println("No hi ha cap element a la llista.");
		}
	}
	
	public void deleteFirstString() {
		
		if(stringList.size()!=0) {
			
			stringList.remove(0);
		}
		else {
			
			System.out.println("No hi ha cap element a la llista.");
		}
	}
}
