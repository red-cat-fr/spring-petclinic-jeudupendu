package org.springframework.samples.petclinic.jeux;

import v2.Player;
import v2.Saisie;

public class PlayerWeb implements Player {

	String name ;
	
	@Override
	public String getPlay() {
		// TODO Auto-generated method stub
		return null;
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
