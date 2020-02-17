import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(1, "hello");
		Employee1 emp2 = new Employee1(2, "abc");
		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(emp1);
		empList.add(emp2);
//		Collections.sort(empList,(o1,o2)->{
//			return o1.getName().compareTo(o2.getName());
//		});
		
		
//		Collections.sort(empList,(o1,o2)->{
//			return o1.getId()-o2.getId();
//		});
		
		
		Collections.sort(list, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		List<Employee1> emp1List = (List<Employee1>) empList.stream().sorted((o1,o2)->o2.getId()-o1.getId()).collect(Collectors.toList());
		emp1List.stream().forEach(e->System.out.println(e.getId()));

		
		
		//map.get(key)
		
		
		
//		System.out.println(empList);
//		empList.stream().sorted((o1,o2)->{
//			return o1.getName().compareTo(o2.getName());
//		}).forEach(e->e.getName());
		
		//empList.forEach(e->System.out.println(e.getName()));


		

	}

}
