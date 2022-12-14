package com.javatechie.sort.git_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingInJava {

	String firstName;
	String lastName;

	public SortingInJava() {

	}

	public SortingInJava(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public static void main(String args[]) {

		List<SortingInJava> list = new ArrayList<SortingInJava>();
		list.add(new SortingInJava("Abdul", "Kalam"));
		list.add(new SortingInJava("Narayan", "Murthy"));
		list.add(new SortingInJava("Mahatma", "Gandhi"));
		list.add(new SortingInJava("Jawaharlal", "Nehru"));
		Collections.sort(list, (SortingInJava o1, SortingInJava o2) -> {
			return o1.getFirstName().compareTo(o2.getFirstName());
		});

		System.out.println(list.toString());

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return "First Name =" + firstName + " Last Name =" + lastName;
	}
}
