package org.springframework.samples.petclinic.jeux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("request")
@RequestMapping("/jeux/jeudupendu")
public class JeuDuPenduWeb {

	private static final String TPL_FOLDER = "jeux";

	@Autowired
	PlayerWeb player ;

	@RequestMapping("")
	public String index( ModelMap model)
	{
		model.put("player", player);
		return TPL_FOLDER + "/jeuDuPendu" ;
	}

	@RequestMapping(value="/player", method=RequestMethod.POST)
	public String playerSet( ModelMap model, @RequestParam String name )
	{
		player.setName(name);
		
		return "redirect:/jeux/jeudupendu" ;
	}

}
