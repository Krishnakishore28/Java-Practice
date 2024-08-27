package com.wipro.controllers;




import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wipro.controllers.DTO.CommunicationDto;
import com.wipro.controllers.DTO.FormDTo;
import com.wipro.controllers.DTO.PhoneNumberDto;
import com.wipro.controllers.DTO.Register;
import com.wipro.controllers.validators.EmailValidator;
import com.wipro.controllers.validators.UserNameValidator;

@Controller
@SessionAttributes("user")
public class HomeController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hii this is working";
	}

	/*
	 * @RequestMapping("/") public String home(Model model) { FormDTo user=new
	 * FormDTo(); model.addAttribute("user", user); return "home"; }
	 */

	// ======replacement of aboove method
	@RequestMapping("/")
	public String home(HttpServletRequest request,Model model) {
		model.addAttribute("user",new FormDTo());
		
		return "home";
	}

	/*
	 * @RequestMapping("/process-home") public String processHome(FormDTo user,Model
	 * model) { model.addAttribute("username", user.getUsername());
	 * model.addAttribute("crushname", user.getCrushname()); return "process-home";
	 * }
	 */
	// ======replacement of aboove method
	@RequestMapping("/process-home")
	public String processhome(@Valid @ModelAttribute("user") FormDTo user,BindingResult result,HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("username", user.getUsername());
		if(result.hasErrors()) {
			return "home";
		}
		List<ObjectError> errors=result.getAllErrors();
		for(ObjectError error:errors) {
			System.out.println(error);
		}
	
		return "process-home";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("register") Register registration)  {
		/*System.out.println("inside the register method");
		CommunicationDto dto=new CommunicationDto();
		PhoneNumberDto phone=new PhoneNumberDto();
		phone.setCountryCode("91");
		phone.setPhoneNumber("985478954");
		dto.setPhoneNumber(phone);
		dto.setEmail("iudsh@ijhdfn");
		registration.setCommunicationDto(dto);*/
		
		return "register";
	}
	@RequestMapping("/registercompleted")
	public String registerCompleted(@Valid @ModelAttribute("register") Register registration,BindingResult result) {
		if(result.hasErrors()) {
			List<ObjectError> errors=result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error);
			}
			System.out.println("has errors");
			return "register";
		}
		else {
			System.out.println("no errors");
			return "register-completed";
		}
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields("username");
//		StringTrimmerEditor editor=new StringTrimmerEditor(true);
//		binder.registerCustomEditor(String.class, "user", editor);
//		binder.addValidators(new UserNameValidator());
//		binder.addValidators(new EmailValidator());
	}
	
}
