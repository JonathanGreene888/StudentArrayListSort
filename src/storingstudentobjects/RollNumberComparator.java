package storingstudentobjects;
import java.util.*; 

public class RollNumberComparator implements Comparator<Object> {
	 
	//** custom roll number comparator using = */
	public int compare(Object o1,Object o2)
	{  
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	return s1.rollnumber = s2.rollnumber;  
	}  
}

