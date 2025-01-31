package set;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter 1 Roll Number");
		s1.setRollno(sc.nextInt());
		System.out.println("Enater 1 Name");
		s1.setName(sc.next());
		System.out.println("Enter 1 address");
		s1.setAddres(sc.next());
		System.out.println("Enter 1 Mobile Number");
		s1.setMobilenumber(sc.nextLong());
		System.out.println("Enter 1 clg fee");
		s1.setClgfee(sc.nextDouble());
		System.out.println("Enter 1 Marks");
		s1.setMarks(sc.nextFloat());
		System.out.println("Enter 1 College name");
		s1.setClgname(sc.next());
		
		
		Student s2=new Student();
		System.out.println("Enter 2 Roll Number");
		s2.setRollno(sc.nextInt());
		System.out.println("Enater 2 Name");
		s2.setName(sc.next());
		System.out.println("Enter 2 address");
		s2.setAddres(sc.next());
		System.out.println("Enter 2 Mobile Number");
		s2.setMobilenumber(sc.nextLong());
		System.out.println("Enter 2 clg fee");
		s2.setClgfee(sc.nextDouble());
		System.out.println("Enter 2 Marks");
		s2.setMarks(sc.nextFloat());
		System.out.println("Enter 2 College name");
		s2.setClgname(sc.next());
		
		Student s3=new Student();
		System.out.println("Enter 3 Roll Number");
		s3.setRollno(sc.nextInt());
		System.out.println("Enater 3 Name");
		s3.setName(sc.next());
		System.out.println("Enter 3 address");
		s3.setAddres(sc.next());
		System.out.println("Enter 3 Mobile Number");
		s3.setMobilenumber(sc.nextLong());
		System.out.println("Enter 3 clg fee");
		s3.setClgfee(sc.nextDouble());
		System.out.println("Enter 3 Marks");
		s3.setMarks(sc.nextFloat());
		System.out.println("Enter 3 College name");
		s3.setClgname(sc.next());
		
		Set<Student> st=new HashSet<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		Iterator<Student> itr=st.iterator();
		
		while(itr.hasNext()) {
			Student si=itr.next();
			System.out.println("Roll Number "+si.getRollno());
		}
		
		
		
		

	}

}
