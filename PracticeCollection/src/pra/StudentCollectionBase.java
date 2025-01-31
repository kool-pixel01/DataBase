package pra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class StudentCollectionBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentCollection sc=new StudentCollection();
sc.setRollno(01);
sc.setName("aaa");
sc.setMobilenumber(1234567889);
sc.setAddress("Balewadi");
sc.setMarks(35);
sc.setCollegefee(15000);
sc.setCollageName("Sihagad");

StudentCollection sc2=new StudentCollection();
sc2.setRollno(02);
sc2.setName("bbb");
sc2.setMobilenumber(1234567889);
sc2.setAddress("Baner");
sc2.setMarks(67);
sc2.setCollegefee(20000);
sc2.setCollageName("JSPM");

StudentCollection sc3=new StudentCollection();
sc3.setRollno(03);
sc3.setName("ccc");
sc3.setMobilenumber(1234567889);
sc3.setAddress("Mahalunge");
sc3.setMarks(35);
sc3.setCollegefee(23000);
sc3.setCollageName("DYPATIL");

List<StudentCollection> l=new ArrayList();

l.add(sc);
l.add(sc2);
l.add(sc3);

/*
 * for (StudentCollection studentCollection : l) {
 * System.out.println("RollNo "+studentCollection.getRollno());
 * System.out.println("Name "+studentCollection.getName());
 * System.out.println("Mobile Number "+studentCollection.getMobilenumber());
 * System.out.println("Address "+studentCollection.getAddress());
 * System.out.println("Marks "+studentCollection.getMarks());
 * System.out.println("College Fee "+studentCollection.getCollegefee());
 * System.out.println("College Name "+studentCollection.getCollageName()); }
 */


Iterator<StudentCollection> itr=l.iterator();
while(itr.hasNext()) {
	StudentCollection studentCollection=itr.next();

	System.out.println("RollNo "+studentCollection.getRollno());
	System.out.println("Name "+studentCollection.getName());
	System.out.println("Mobile Number "+studentCollection.getMobilenumber());
	System.out.println("Address "+studentCollection.getAddress());
	System.out.println("Marks "+studentCollection.getMarks());
	System.out.println("College Fee "+studentCollection.getCollegefee());
	System.out.println("College Name "+studentCollection.getCollageName());
	System.out.println();
	
	
	
}





	}

}
