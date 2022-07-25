package Nivell_2_1;

public class Contact {
	
	private ContactFactory contact;
	private Phone phone;
	private Address address;
	private String name;
	
	public Contact(ContactFactory contact, String phoneNumber, String name, String street, String number, String flat, String postalCode, String location) {
		
		this.contact=contact;
		this.phone=this.contact.createPhone(phoneNumber);
		this.address=this.contact.createAddress(street, number, flat, postalCode, location);
		this.name=name;
	}
	
	public ContactFactory getContact() {
		return contact;
	}

	public void setContact(ContactFactory contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return name+"\n"+phone+ "\n"+address+ "\n";
	}
}
