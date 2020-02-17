package tEST.one.java8.comparable.comparator.test;

public class Student implements Comparable<Student>{
	private int rollNo;
	private int age;
	private String name;
	
	
	
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getAge() == o.getAge()) {
			return this.getRollNo() - o.getRollNo();
		}
		return this.getAge() - o.getAge();
		//this.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age : "+age+" rollNo "+rollNo+" name"+name;
	
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Student st = (Student) obj;
//		if(this.getAge()==st.getAge()&&this.getName().equals(st.getName())) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		
//		return this.getRollNo();
//	}
	

}
