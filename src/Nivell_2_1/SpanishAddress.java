package Nivell_2_1;

public class SpanishAddress implements Address{
	
	private String street;
	private String number;
	private String flat;
	private String postalCode;
	private String location;
	private final String country;
	
	
	public SpanishAddress(String street, String number, String flat, String postalCode, String location) {
		
		this.street=street;
		this.number=number;
		this.flat=flat;
		this.postalCode=postalCode;
		this.location=location;
		this.country="España";
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return street+" "+number+", "+flat +"\n"+postalCode+", "+location+"\n"+country;
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
		
		return street+" "+number+", "+flat +"\n"+postalCode+", "+location+"\n"+country;
	}

}
