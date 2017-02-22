package org.springframework.samples.petclinic.essais;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EssaiModel {

	class Person {
		public String firstname;
		public String lastname;
	}

	@RequestMapping("/essais")
	public String welcome() {

		return "essais/index";
	}

	@RequestMapping("/essais/EssaiModel")
	public String essaiModel(Map<String, Object> model,
		@RequestParam(required = false, defaultValue = "bel inconnu") String name) {

System.err.println("Ici");

		model.put("welcome", "Salut");
		model.put("name", name);

		Person p = new Person();
		p.firstname = "Bob";
		p.lastname = "Morane";

		model.put("person", p);

System.err.println("Et là");

		return "essais/essaiModel";
	}

	public void toto( boolean on )
	{

	}
	
}
