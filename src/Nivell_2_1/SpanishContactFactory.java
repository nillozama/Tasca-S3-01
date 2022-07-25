package Nivell_2_1;

public class SpanishContactFactory implements ContactFactory{

	@Override
	public Phone createPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		return new SpanishPhone(phoneNumber);
	}

	@Override
	public Address createAddress(String street, String number, String flat, String postalCode, String location) {
		// TODO Auto-generated method stub
		return new SpanishAddress(street, number, flat, postalCode, location);
	}
}
