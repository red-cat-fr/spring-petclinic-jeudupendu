package org.springframework.samples.petclinic.essais;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope("request")
public class EssaisForm {

	@Autowired
	Counter counter;

	@RequestMapping("/essais/form01")
	public String form01Get( ModelMap model )
	{
		counter.inc();
		model.put("counter", counter );
		
		return "essais/form01";
	}

	@RequestMapping(value="/essais/form01", method=RequestMethod.POST )
	public String form01Post(
			@RequestParam(required = false, defaultValue = "bel inconnu") String name,
			@RequestParam(required = false, defaultValue = "0123") String phone,
			@RequestParam(required = false, defaultValue = "0123") int[] hobbies
			)
	{

		// Du "dump" pour découvrir

		System.err.println("name: "+name);
		System.err.println("phone: "+phone);
		System.err.println("hobbies: "+ Arrays.toString(hobbies) );
		for( int i=0; i<hobbies.length; i++)
		{
			System.err.println("\thobbies[" + i + "] : "+ hobbies[i] );			
		}

		return "essais/form01";
	}

	@RequestMapping(value="/essais/form01v2", method=RequestMethod.POST )
	public String form01PostV2( @Valid Person person, BindingResult result, ModelMap model )
	{

		// Du "dump" pour découvrir

		System.err.println( "Des erreurs ? " + result.hasErrors() );
		for( ObjectError oe : result.getAllErrors() )
		{
			System.err.println( "Erreur: " + oe.getObjectName() + ", " + oe.getCode() + ", "+ oe.getDefaultMessage() );
		}
		System.err.println( person );

		// Le "vrai" code commence ici

		if( result.hasErrors() )
		{
			model.put( "result", result) ;
			return "essais/form01" ;
		}

		return "essais/form01";
	}

}













