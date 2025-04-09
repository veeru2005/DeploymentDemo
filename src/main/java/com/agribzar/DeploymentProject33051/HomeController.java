package com.agribzar.DeploymentProject33051;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping({"/", "/home", "/status"})
	public String getStatus()
	{
		return "09/04/2025 Today Task Completed Sir - Veeru - 33051";
	}
}
