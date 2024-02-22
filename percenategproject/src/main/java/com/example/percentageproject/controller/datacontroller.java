package com.example.percentageproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/control")
public class datacontroller {
	@PostMapping
	public String displaydata(@RequestParam String name,@RequestParam int s1,@RequestParam int s2,@RequestParam int s3,@RequestParam int s4,@RequestParam int s5) {
		
		int sum=s1+s2+s3+s4+s5;
		double percentage=sum/5;

		return name+" "+"percenatege is :"+percentage+"%";

	}
}
