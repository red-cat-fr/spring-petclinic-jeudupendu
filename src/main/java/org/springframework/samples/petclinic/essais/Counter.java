package org.springframework.samples.petclinic.essais;

// Cette configuration a été déplacée dans la classe CounterConfiguration
// @Component
// @Scope("session")
public class Counter {

	public Counter()
	{
	}

	int count ;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int inc() {

		return this.count += 1 ;
	}
	
}
