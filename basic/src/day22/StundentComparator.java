package day22;

import java.util.Comparator;

import day22.ComparaExample.Student;

public class StundentComparator implements Comparator<Student>{ 
	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
		
	}

}
