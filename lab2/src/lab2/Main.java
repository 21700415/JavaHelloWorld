package lab2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동");
		s.setAge(20);
		list.add(s);
		list.add(new Student(2, "철수", 22));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		list.remove(0);
		System.out.println("홍길동 삭제됨 ");
		
		
		for(Student obj : list ) {
			System.out.println(obj.toString());
		}

	}

}
