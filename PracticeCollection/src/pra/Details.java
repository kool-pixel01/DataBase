package pra;

import java.util.Scanner;

public class Details {
StudentSetter ss=new StudentSetter();
Scanner sc=new Scanner(System.in);

	public void SetData() {
		System.out.println("Enter Student Roll Number");
		int rollno=sc.nextInt();
		ss.setRollno(rollno);
		System.out.println("Enter Student Name");
		String name=sc.next();
		ss.setName(name);
		System.out.println("Enter Mobile Number");
		ss.setMobileNumber(sc.nextLong());
		System.out.println("Enter Address");
		ss.setAddress(sc.next());
	}
	
	public void getData() {
		System.out.println("RollNumber "+ss.getRollno());
		System.out.println("Name "+ss.getName());
		System.out.println("Mobile Number "+ss.getMobileNumber());
		System.out.println("Address "+ss.getAddress());
		
	}
	
}
