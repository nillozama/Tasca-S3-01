package Nivell_3_1;

public class Car extends Vehicle{

	@Override
	String start() {
		// TODO Auto-generated method stub
		return "Arrenca cotxe.";
	}

	@Override
	String speedUp() {
		// TODO Auto-generated method stub
		return "Acelera cotxe.";
	}

	@Override
	String brake() {
		// TODO Auto-generated method stub
		return "Frena cotxe.";
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "car";
	}

}
