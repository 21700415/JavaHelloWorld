
public class Student implements  Comparable<Student>{
	
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.no = i;
		this.name = string;
		this.age = j;
	}
	
	int no;
	String name;
	int age;

	

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}
