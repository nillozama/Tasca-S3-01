package Nivell_2_1;

public interface ContactFactory {
	
	Phone createPhone(String phoneNumber);
	Address createAddress(String street, String number, String flat, String postalCode, String location);
}
