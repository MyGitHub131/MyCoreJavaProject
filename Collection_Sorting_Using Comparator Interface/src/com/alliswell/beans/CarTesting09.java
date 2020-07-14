
package com.alliswell.beans;

import java.util.Set;
import java.util.TreeSet;

public class CarTesting09 {
	public static void main(String[] args) {
		Set<Car> c = new TreeSet<Car>(new SortingByCarIdComparator());
		
		c.add(new Car(107, "Hyundai Verna"));
		c.add(new Car(207, "Honda City"));
		c.add(new Car(307, "MarutiSuzki"));

		for (Car car : c) {
			System.out.println(car.id + "=======" + car.name);
		}
	}
}
