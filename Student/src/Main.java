import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101, "Kim", 23);
		al.add(s1);
		Student s2=new Student(102, "Choi", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Ahn", 20));
		al.add(new Student(105, "Max", 29));
		al.add(new Student(106, "Cha", 28));
		al.add(new Student(107, "Baek", 27));
		al.add(new Student(108, "Bok", 26));
		al.add(new Student(109, "Son", 22));
		al.add(new Student(110, "Moon", 30));
		
		Collections.sort(al);
		for(Student s: al) {
			System.out.println(s.name.toString());
		}
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).name.toString());
		}

	}

}
