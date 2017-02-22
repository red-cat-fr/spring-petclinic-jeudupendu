package org.springframework.samples.petclinic.jeux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import v2.Partie;

@Controller
@Scope("request")
@RequestMapping("/jeux/jeudupendu")
public class JeuDuPenduWeb {

	private static final String TPL_FOLDER = "jeux";

	@Autowired
	PlayerWeb player ;
	@Autowired
	Partie game ;

    @ModelAttribute("player")
	public PlayerWeb getPlayerWeb(){
		return player ;
	}

	@RequestMapping("")
	public String index( ModelMap model)
	{
		// Remplacé par @ModelAttribute("player")
		//model.put("player", player);
		
		model.put("game", game );
		
		return TPL_FOLDER + "/jeuDuPendu" ;
	}

	@RequestMapping(value="/player", method=RequestMethod.POST)
	public String playerSet( ModelMap model, @RequestParam String name )
	{
		player.setName(name);
		
		return "redirect:/jeux/jeudupendu" ;
	}

	@RequestMapping(value="/game", method=RequestMethod.POST)
	public String gameNew( ModelMap model )
	{
		game.newPlay(player);

		return "redirect:/jeux/jeudupendu" ;
	}

	@RequestMapping(value="/play", method=RequestMethod.POST)
	public String playNext( ModelMap model, @RequestParam String proposal )
	{
		player.setPlay( proposal );
		game.nextPlay();

		return "redirect:/jeux/jeudupendu" ;
	}

}
