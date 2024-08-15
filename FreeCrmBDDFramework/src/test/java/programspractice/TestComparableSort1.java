package programspractice;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableSort1 {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<>();
		
		arr.add(new Student(107, "Ajay", 23));
		arr.add(new Student(105, "Vijay", 21));
		arr.add(new Student(106, "Jai", 27));

		
		Collections.sort(arr);
		
		for(Student st: arr) {
			System.out.println(st.rollNo +" "+ st.name +" "+ st.age);
		}
		
		
		
		
		
	}

}
