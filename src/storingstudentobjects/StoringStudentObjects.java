package storingstudentobjects;
import java.util.*;

import jonathansort.JonathanSort;  

//** Handles storing student objects in an array list */
public class StoringStudentObjects {

	public static void main(String[] args) {
		
		ArrayList<Student> studentArrayList=new ArrayList<Student>();  
		studentArrayList.add(new Student(101,"joe","1001 Tacoma drive"));  
		studentArrayList.add(new Student(102,"dave","1002 Tacoma drive"));  
		studentArrayList.add(new Student(103,"tom","1003 Tacoma drive"));  
		studentArrayList.add(new Student(104,"chris","1004 Tacoma drive"));  
		studentArrayList.add(new Student(105,"jenna","1005 Tacoma drive"));  
		studentArrayList.add(new Student(106,"mary","1006 Tacoma drive"));  
		studentArrayList.add(new Student(107,"susan","1007 Tacoma drive"));  
		studentArrayList.add(new Student(108,"becca","1008 Tacoma drive"));  
		studentArrayList.add(new Student(109,"jenee","1009 Tacoma drive"));  
		studentArrayList.add(new Student(110,"jessica","1010 Tacoma drive"));  
		
		JonathanSort jonathanSort = new JonathanSort();
		jonathanSort.sort(studentArrayList, new NameComparator());  
		Iterator<Student> itr = studentArrayList.iterator();  
		while (itr.hasNext())
		{  
		Student st = (Student)itr.next();  
		System.out.println(st.rollnumber+ " "+st.name+ " "+st.address);
		}
	}

}
