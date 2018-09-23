/**
 * 
 */
package br.com.adapt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;

import br.com.adapt.model.Tag;
import br.com.adapt.model.User;
import br.com.adapt.service.TagService;
import br.com.adapt.service.UserService;

/**
 * @author mayra
 *
 */
@Controller
public class TagController {
	
	private static final String MSG_SUCESS_INSERT = "Tag inserted successfully.";
	private static final String MSG_SUCESS_UPDATE = "Tag successfully changed.";
	private static final String MSG_SUCESS_DELETE = "Deleted tag successfully.";
	private static final String MSG_ERROR = "Error.";

	@Autowired
	private TagService tagService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/tags")
	public String index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByEmailAdress(auth.getName());
		List<Tag> all = user.getScheduler().getTags();
		model.addAttribute("tags", all);
        return "tags/index";
    }

	@GetMapping("/tags/create")
	public String create(Model model) {
        return "tags/create";
    }
	
	
}
