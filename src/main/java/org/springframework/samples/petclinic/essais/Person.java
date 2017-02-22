package org.springframework.samples.petclinic.essais;

import java.util.Arrays;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

	public Person() {
	}

	@NotNull
	@Size(min=3, max=32)
	String name;

	@Pattern(regexp="[0-9 ]{10,14}")
	String phone;

	int gender;
	int[] hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(int[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		String s = "name: " + this.getName()
			+ "\n" + "phone: " + getPhone()
			+ "\n" + "gender: " + getGender() + "\n"
			+ "hobbies: " + Arrays.toString(getHobbies());
		
		if (getHobbies() != null) {
			for (int i = 0; i < getHobbies().length; i++) {
				s += "\n" + "\thobbies[" + i + "] : " + getHobbies()[i];
			}
		} else {
			s += "\n" + "\tNo hobby";
		}

		return s;
	}
}










