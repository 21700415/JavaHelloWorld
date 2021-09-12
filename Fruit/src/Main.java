import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> f1=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1=new Fruit (101, "Apple", 1000);
		f1.add(s1);
		Fruit s2=new Fruit(102, "Orange", 1500);
		f1.add(s2);
		f1.add(new Fruit(103, "Kiwi", 2000));
		f1.add(new Fruit(104, "Mango", 2500));
		f1.add(new Fruit(105, "Watermelon", 3000));
		f1.add(new Fruit(106, "Melon", 4000));
		f1.add(new Fruit(107, "Banana", 5000));
		f1.add(new Fruit(108, "Cherry", 6000));
		f1.add(new Fruit(109, "Berry", 7000));
		f1.add(new Fruit(110, "Gold kiwi", 8000));
		
		
		
		Collections.sort(f1, new FruitComparator());
		for (Fruit s : f1) {
			System.out.println(s.name.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(f1, new FruitComparatorDesc());
		for (int i=0; i<f1.size(); i++) {
			System.out.println(f1.get(i).name.toString());
		}

	}

}
