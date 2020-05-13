package funcInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("Ravi","Gupta",35,"0609013071");
		Student s2 = new Student("Ekta","Gupta",30,"0609013072");
		Student s3=  new Student("Vinay","Arora",34,"0609013073");
		
		ArrayList<Student> ar  = new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		
		Comparator<Student> ageComp = (Student s11, Student s22) -> s11.getAge() - s22.getAge();
		
		Collections.sort(ar, ageComp);

		/*
		 * Iterator<Student> itr = ar.iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * System.out.println((Student)itr.next()); }
		 */
		ar.forEach(System.out::println);
		
	}

}
