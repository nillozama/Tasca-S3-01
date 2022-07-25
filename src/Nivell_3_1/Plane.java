package Nivell_3_1;

public class Plane extends Vehicle{

	@Override
	String start() {
		// TODO Auto-generated method stub
		return "Arrenca avió.";
	}

	@Override
	String speedUp() {
		// TODO Auto-generated method stub
		return "Acelera avió.";
	}

	@Override
	String brake() {
		// TODO Auto-generated method stub
		return "Frena avió.";
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "plane";
	}
}
