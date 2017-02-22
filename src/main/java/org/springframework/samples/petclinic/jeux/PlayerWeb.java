package org.springframework.samples.petclinic.jeux;

import v2.Player;
import v2.Saisie;

public class PlayerWeb implements Player {

	String name ;
	String proposal ;
	
	public void setPlay(String proposal)
	{
		this.proposal = proposal ;
	}
	
	@Override
	public String getPlay() {
		
		return proposal;
	}

	@Override
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = name ;
	}

	@Override
	public void setSaisie(Saisie saisie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String askName() {
		// TODO Auto-generated method stub
		return null;
	}

}
