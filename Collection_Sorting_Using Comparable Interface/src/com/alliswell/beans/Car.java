package com.alliswell.beans;

public class Car implements Comparable<Car> {
	int id;
	String name;

	public Car(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Car c) {
		/*if(id > c.id){
			return +1;
		}else if (id < c.id) {
			return -1;
		}else {
			return 0;
		}*/
		return name.compareTo(c.name);
	}

}
