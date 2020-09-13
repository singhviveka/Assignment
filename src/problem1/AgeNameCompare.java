package problem1;

import java.util.Comparator;

public class AgeNameCompare implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		if(arg0.getAge() != arg1.getAge())
	    	return arg0.getAge() < arg1.getAge()?-1:1;
	    else 
	    	return arg0.getName().compareTo(arg1.getName());	    
	}

}
