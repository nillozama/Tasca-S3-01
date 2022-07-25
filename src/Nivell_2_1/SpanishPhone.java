package Nivell_2_1;

public class SpanishPhone implements Phone{
	
	private String phoneNumber;
	
	public SpanishPhone(String phoneNumber) {
		
		this.phoneNumber="+34 "+phoneNumber;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		this.phoneNumber="+34 "+phoneNumber;
	}
	
	@Override
	public String toString() {
		
		return phoneNumber;
	}

}
