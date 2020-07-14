package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class CarTesting04 {
	public static void main(String[] args) {

		Set<Car> c = new TreeSet<Car>();
		c.add(new Car(307, "Hyundai Verna"));
		c.add(new Car(207, "Honda City"));
		c.add(new Car(107, "Maruti Suzuki"));

		for (Car car : c) {
			System.out.println(car.name + "-------" + car.id);
		}
	}
}
