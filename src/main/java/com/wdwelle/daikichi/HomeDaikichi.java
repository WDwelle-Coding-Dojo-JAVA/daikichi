package com.wdwelle.daikichi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/travel/{local}")
	public String travel(@PathVariable("local") String local) {
		return "congratulations you will soon travel to " + local;
	}
	@GetMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if(num%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting ofers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
}
