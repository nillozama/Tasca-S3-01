package Nivell_3_1;

public class SpeedUpCommand extends Command{

	public SpeedUpCommand(Vehicle vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		String type=vehicle.getType();
		
		switch(type) {
		
		case "plane":
			
			Plane plane=(Plane)vehicle;
			System.out.println(plane.speedUp());
			break;
			
		case "car":
			
			Car car=(Car)vehicle;
			System.out.println(car.speedUp());
			break;
			
		case "bike":
			
			Bike bike=(Bike)vehicle;
			System.out.println(bike.speedUp());
			break;
			
		case "ship":
			
			Ship ship=(Ship) vehicle;
			System.out.println(ship.speedUp());
			break;
			
		default:
			
			System.out.println("Vehicle inexistent.");
		}
	}
}
