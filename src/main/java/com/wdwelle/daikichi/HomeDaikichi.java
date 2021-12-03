package com.wdwelle.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class HomeDaikichi {
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all you do";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow you will gain new oppurtunities!";
	}
}
