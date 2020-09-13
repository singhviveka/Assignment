package problem1;

import java.util.Collections;
import java.util.List;

public class Sorting {
	List<Student> sort(List<Student> students, String[] criteria){
		if(criteria.length==1) {
			Collections.sort(students, new NameCompare());
		}else if(criteria.length==2) {
			if(criteria[0].equals("name"))
				Collections.sort(students, new NameAgeCompare());
			else
				Collections.sort(students, new AgeNameCompare());
		}else if(criteria.length==3) {
			Collections.sort(students, new MarksRollAgeCompare());
		}else {
			Collections.sort(students, new AgeMarksNameRollCompare());
		}
		
		return students;
	}

}
