package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoMVCController {

	@GetMapping("/message")
	// @ResponseBody
	public String information() {
		return "first/message";
	}
}