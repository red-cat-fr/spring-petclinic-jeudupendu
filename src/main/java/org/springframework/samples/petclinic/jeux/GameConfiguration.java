package org.springframework.samples.petclinic.jeux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GameConfiguration {

	@Bean
	@Scope("session")
	public PlayerWeb createPlayerWeb ()
	{
		return new PlayerWeb();
	}
}
