package org.springframework.samples.petclinic.jeux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import v2.Partie;
import v2.WordsGenerator;
import v2.jeuDuPendu.JeuDuPendu;
import v2.wordsGenerators.WGArray;

@Configuration
public class GameConfiguration {

	@Bean
	@Scope("session")
	public PlayerWeb createPlayerWeb ()
	{
		return new PlayerWeb();
	}

	@Bean
	@Scope("singleton")
	public WordsGenerator createWordsGenerator()
	{
		return new WGArray();
	}

	@Bean
	@Scope("session")
	public Partie createJeuDuPendu( WordsGenerator wg )
	{
		Partie p = new JeuDuPendu();
		p.setWordGenerator(wg);
		return p ;
	}
}
