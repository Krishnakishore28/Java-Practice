package com.wipro.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/sugar")
	public String sugar() {
		return "this is susgar";
	}
	@RequestMapping("/jsps")
	public String views() {
		return "sugars";
	}

}
