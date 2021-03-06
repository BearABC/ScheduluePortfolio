package scheduleshare.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import scheduleshare.domain.model.form.UserForm;
import scheduleshare.domain.model.service.ConsumerService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	ConsumerService consumerService;
	@Autowired
	UserForm userForm;

	@RequestMapping(value="/regist")
	public String consumerRegist(Model model) {
		model.addAttribute("userForm", userForm);
		return "/regist";
	}

	@RequestMapping(value="/check")
	public String consumerCheck(Model model,@Validated UserForm userForm, Errors errors) {
		if(errors.hasErrors()) {
			return "/regist";
		}
		return "/check";
	}
}
