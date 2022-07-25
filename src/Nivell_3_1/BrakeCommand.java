package Nivell_3_1;

public class BrakeCommand extends Command{

	public BrakeCommand(Vehicle vehicle) {
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
			System.out.println(plane.brake());
			break;
			
		case "car":
			
			Car car=(Car)vehicle;
			System.out.println(car.brake());
			break;
			
		case "bike":
			
			Bike bike=(Bike)vehicle;
			System.out.println(bike.brake());
			break;
			
		case "ship":
			
			Ship ship=(Ship) vehicle;
			System.out.println(ship.brake());
			break;
			
		default:
			
			System.out.println("Vehicle inexistent.");
		}
	}
}
