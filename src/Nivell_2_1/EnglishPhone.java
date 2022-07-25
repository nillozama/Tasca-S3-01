package Nivell_2_1;

public class EnglishPhone implements Phone{
	
	private String phoneNumber;
	
	public EnglishPhone(String phoneNumber) {
		
		this.phoneNumber="+44 "+phoneNumber;
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		this.phoneNumber="+44 "+phoneNumber;
	}
	
	@Override
	public String toString() {
		
		return phoneNumber;
	}

}
