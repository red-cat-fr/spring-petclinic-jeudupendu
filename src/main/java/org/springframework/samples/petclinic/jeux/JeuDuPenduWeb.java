package org.springframework.samples.petclinic.jeux;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jeux/jeudupendu")
public class JeuDuPenduWeb {

	private static final String TPL_FOLDER = "jeux";

	@RequestMapping("/")
	public String index()
	{
		return TPL_FOLDER + "/jeuDuPendu" ;
	}
}
