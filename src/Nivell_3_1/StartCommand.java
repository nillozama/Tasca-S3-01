package Nivell_3_1;

public class StartCommand extends Command{

	public StartCommand(Vehicle vehicle) {
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
			System.out.println(plane.start());
			break;
			
		case "car":
			
			Car car=(Car)vehicle;
			System.out.println(car.start());
			break;
			
		case "bike":
			
			Bike bike=(Bike)vehicle;
			System.out.println(bike.start());
			break;
			
		case "ship":
			
			Ship ship=(Ship) vehicle;
			System.out.println(ship.start());
			break;
			
		default:
			
			System.out.println("Vehicle inexistent.");
		}
	}
}
