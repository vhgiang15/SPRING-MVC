package spring.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.UserInfo;

@Controller
public class HelloForm {
	/*
	 * @RequestMapping("/") public String index() { return "index"; }
	 */
@RequestMapping("/")
public String showForm(ModelMap model) {
	model.addAttribute("user", new UserInfo());
	return "HelloInput";
}
@RequestMapping(value = "hello")
public String sayHello(@ModelAttribute("user") UserInfo user) {
	return "HelloSay";
}
}
