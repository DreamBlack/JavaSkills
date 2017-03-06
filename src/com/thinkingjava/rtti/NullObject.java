package com.thinkingjava.rtti;

import java.util.ArrayList;

/**
 * *****************************************************************************************
 * 类描述：Java空对象，为了应对频繁的null检查
 *
 * @author: wycheng @date： 2017年3月6日 下午8:59:00
 * @version 1.0
 * 
 *******************************************************************************************
 */
interface Null {

}

class Person {
	public final String first;
	public final String last;
	public final String address;

	public Person(String first, String last, String address) {
		super();
		this.first = first;
		this.last = last;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}

	public static class NullPerson extends Person implements Null {
		private NullPerson() {
			super("None", "None", "None");
		}

		@Override
		public String toString() {
			return "NullPerson";
		}
	}

	public static final Person NULL = new NullPerson();
}

class Position {
	private String title;
	private Person person;

	public Position(String title, Person person) {
		super();
		this.title = title;
		this.person = person;
		if (person == null) {
			this.person = Person.NULL;
		}
	}

	public Position(String title) {
		this.title = title;
		this.person = Person.NULL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
		if (person == null) {
			this.person = Person.NULL;
		}
	}

	@Override
	public String toString() {
		return "Position: " + title + " " + person;
	}
}

class Staff extends ArrayList<Position> {
	private static final long serialVersionUID = 1L;

	public void add(String title, Person person) {
		add(new Position(title, person));
	}

	public void add(String... titles) {
		for (String title : titles) {
			add(new Position(title));
		}
	}

	public Staff(String... titles) {
		add(titles);
	}

	/**
	 * 在某些地方仍必须测试空对象，这与检查是否为null没有差异，
	 * 但是在其他地方就不必执行额外的测试了，而且可以假定所有对象都是有效的
	 * 
	 * @param title
	 * @return
	 */

	public boolean positionAvailable(String title) {
		for (Position p : this) {
			if (p.getTitle().equals(title) && p.getPerson() == Person.NULL) {
				return true;
			}
		}
		return false;
	}
}

public class NullObject {
	public static void main(String[] args) {

	}
}
