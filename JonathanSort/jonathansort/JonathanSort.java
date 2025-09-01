package jonathansort;

import java.util.ArrayList;

import storingstudentobjects.NameComparator;
import storingstudentobjects.Student;

public class JonathanSort {

	//** A custom sort created that uses a name comparator instead of built in Java sort.*/
	public void sort(ArrayList<Student> studentArray, NameComparator nameComparator) {
		
				// loop over the index
				for (int i = 0; i < studentArray.size() - 1; i++) {
					
					int minimumIndex = i;
					
					// loop over the i + 1 
					for (int j = i + 1; j < studentArray.size(); j++) {
						// Use the comparator to compare the Student objects
						
						if (nameComparator.compare(studentArray.get(j), studentArray.get(minimumIndex)) < 0) {
							minimumIndex = j;
						}
					}
					
					Student tempValue = studentArray.get(minimumIndex);
					
					studentArray.set(minimumIndex, studentArray.get(i));
					
					//** swap the j and i */ 
					studentArray.set(i, tempValue);
				}
	}

}
