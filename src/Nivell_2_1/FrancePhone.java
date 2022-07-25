package Nivell_2_1;

public class FrancePhone implements Phone{
	
	private String phoneNumber;
	
	public FrancePhone(String phoneNumber) {
		
		this.phoneNumber="+33 "+phoneNumber;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		this.phoneNumber="+33 "+phoneNumber;
	}
	
	@Override
	public String toString() {
		
		return phoneNumber;
	}

}
