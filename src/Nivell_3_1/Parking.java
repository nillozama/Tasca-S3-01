package Nivell_3_1;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
	private static List<Vehicle> vehicleList=new ArrayList<Vehicle>();
	
	public static void main(String args[]) {
		
		Plane plane=new Plane();
		Car car=new Car();
		Bike bike=new Bike();
		Ship ship=new Ship();
		
		addToList(bike);
		addToList(car);
		addToList(plane);
		addToList(ship);
		
		for(Vehicle vehicle: vehicleList){
			
			for(int i=1; i<4;i++) {
				
				runType(i,vehicle);
			}
		}
	}
	
	public static void addToList(Vehicle vehicle) {
		
		vehicleList.add(vehicle);
	}
	
	public static void runType(int option, Vehicle thisVehicle) {
		
		switch (option) {
		
		case 1:
			
			new StartCommand(thisVehicle).execute();
			break;
			
		case 2:
			
			new SpeedUpCommand(thisVehicle).execute();
			break;
			
		case 3:
			
			new BrakeCommand(thisVehicle).execute();
			break;
			
		default:
			
			System.out.println("No es una opció correcte.");
		}
	}
}
