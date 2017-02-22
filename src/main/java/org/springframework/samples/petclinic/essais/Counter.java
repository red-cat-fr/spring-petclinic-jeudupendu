package org.springframework.samples.petclinic.essais;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
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
