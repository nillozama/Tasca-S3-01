package Nivell_2_1;

public class FranceAddress implements Address{

	private String street;
	private String number;
	private String flat;
	private String postalCode;
	private String location;
	private final String country;
	
	
	public FranceAddress(String street, String number, String flat, String postalCode, String location) {
		
		this.street=street;
		this.number=number;
		this.flat=flat;
		this.postalCode=postalCode;
		this.location=location;
		this.country="França";
	}
	
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return number+" "+street+"\n"+flat+"\n"+ postalCode+", "+location+"\n"+country;
	}

	@Override
	public void setAddress(String street, String number, String flat, String postalCode, String location) {
		// TODO Auto-generated method stub
		this.street=street;
		this.number=number;
		this.flat=flat;
		this.postalCode=postalCode;
		this.location=location;
	}

	@Override
	public String toString() {
		
		return number+" "+street+"\n"+flat+"\n"+ postalCode+", "+location+"\n"+country;
	}
}
