package Nivell_2_1;

public class FranceContactFactory implements ContactFactory{

	@Override
	public Phone createPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		return new FrancePhone(phoneNumber);
	}

	@Override
	public Address createAddress(String street, String number, String flat, String postalCode, String location) {
		// TODO Auto-generated method stub
		return new FranceAddress(street, number, flat, postalCode, location);
	}

}
