package storingstudentobjects;

//** Definition of what a student is and what properties it has */
public class Student {
	
	int rollnumber;  
	String name;  
	String address;  
	
	Student(int rollnumber,String name,String address)
	{  
		this.rollnumber=rollnumber;  
		
	    //** Make sure there are no nulls */
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Must have a value in Name.");
        }
		this.name=name;  
		
		   //** Make sure there are no nulls */
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Must have a value in address.");
        }
		this.address=address;  
	}  
}

