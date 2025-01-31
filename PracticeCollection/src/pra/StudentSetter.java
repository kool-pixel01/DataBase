package pra;

public class StudentSetter {
	
	private int rollno;
	private String name;
	private long mobileNumber;
	private String address;
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
    public void setMobileNumber(long mobileNumber) {
	this.mobileNumber=mobileNumber;
	}
public void setAddress(String addres) {
	this.address=addres;
}

public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public long getMobileNumber() {
	return mobileNumber;
}
public String getAddress() {
	return address;
}
}
