package br.com.adapt.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(Model model) {
        return "auth/login";
    }
	
}
