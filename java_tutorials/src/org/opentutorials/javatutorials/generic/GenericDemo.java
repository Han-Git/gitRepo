package org.opentutorials.javatutorials.generic;

interface Info{
	int getLevel();
}

class EmployeeInfo implements Info{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

// restriction of Generic. In this case, you can only put which has Info as super class
class Person<T extends Info>{
	public T info;
	Person(T info){
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(12));
		System.out.println(p1.info.getLevel());
		
		// error because it(String) doesn't extend Info
		//Person<String> p2 = new Person<String>("∫Œ¿Â");
	}
}
