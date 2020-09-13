package problem1;

import java.util.Comparator;

public class MarksRollAgeCompare implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		
	    if(arg0.getMarks() != arg1.getMarks())
	    	return arg0.getMarks()<arg1.getMarks()?1:-1;
	    else if(arg0.getRollNumber().equals(arg1.getRollNumber())==false)
	    	return arg0.getRollNumber().compareTo(arg1.getRollNumber());
	    else
	    	return arg0.getAge() < arg1.getAge()?-1:1;
	}

}
