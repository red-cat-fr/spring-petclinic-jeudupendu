package org.springframework.samples.petclinic.essais;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CounterConfiguration {

	@Bean
	@Scope("session")
	public Counter createCounter()
	{
		return new Counter();
	}
}
