package es.salesianos.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class WelcomeController {
	
	@GetMapping(path = "/")
	public String welcome() {
		return "index";
	}
}