package tEST.one.java8.biConsumerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Test {
	public static void populate(List<Employee> list) {
		list.add(new Employee("hello",1000));
		list.add(new Employee("hai",2000));

		
		
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		//populate(list);
		list.add(new Employee("hello",1000));
		list.add(new Employee("hai",2000));
		BiConsumer<Employee, Integer> c = (e,d)->e.setSalary(e.getSalary()+d);
		for(Employee e :list) {
			c.accept(e, 500);
		}
		
		list.forEach(e->{System.out.println(e.getName()+ " "+e.getSalary());});
		
		
		Writer w = new Programmer();
		w.m1();

	}

}
