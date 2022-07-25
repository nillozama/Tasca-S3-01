package Nivell_3_1;

public class Ship extends Vehicle{

	@Override
	String start() {
		// TODO Auto-generated method stub
		return "Arrenca vaixell.";
	}

	@Override
	String speedUp() {
		// TODO Auto-generated method stub
		return "Acelera vaixell.";
	}

	@Override
	String brake() {
		// TODO Auto-generated method stub
		return "Frena vaixell.";
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "ship";
	}
}
