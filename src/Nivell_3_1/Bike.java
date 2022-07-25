package Nivell_3_1;

public class Bike extends Vehicle{

	@Override
	String start() {
		// TODO Auto-generated method stub
		return "Arrenca bici.";
	}

	@Override
	String speedUp() {
		// TODO Auto-generated method stub
		return "Acelera bici.";
	}

	@Override
	String brake() {
		// TODO Auto-generated method stub
		return "Frena bici.";
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "bike";
	}
}
