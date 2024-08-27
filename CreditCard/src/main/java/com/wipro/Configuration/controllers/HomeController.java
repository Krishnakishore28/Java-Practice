package com.wipro.Configuration.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.Configuration.Dto.BillDetails;
import com.wipro.Configuration.Dto.CreditCardNumber;
import com.wipro.Configuration.Formatters.CreditCardFormatters;
import com.wipro.Configuration.propertyeditors.CreditCardPropertyEditor;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hii this is working";
	}
	@RequestMapping("/bill")
	public String bill(@ModelAttribute("details") BillDetails details) {
		CreditCardNumber source=new CreditCardNumber();
		source.setFirstNumber(1235);
		source.setSecondNumber(8767);
		source.setThirdNumber(6785);
		source.setFourthNumber(1234);
		return "bill";
	}
	@RequestMapping("/bill-process")
	public String processBill(@ModelAttribute("details") BillDetails details) {
		System.out.println(details);
		return "billprocess";
	}
	@InitBinder
	public void Binder(WebDataBinder binder) {
		
		
		//================ adding custome property editor=======
//		CreditCardPropertyEditor creditCardEditor=new CreditCardPropertyEditor();
//		binder.registerCustomEditor(CreditCardNumber.class, "creditcardNumber", creditCardEditor);
//		
		//=======adding formatters=================
		//binder.addCustomFormatter(new CreditCardFormatters());
		
		//=======for currency entering with commas=======
		/*NumberFormat format=new DecimalFormat("##,###");
		CustomNumberEditor editor=new CustomNumberEditor(BigDecimal.class,format, true);
		binder.registerCustomEditor(BigDecimal.class, "amount",editor);*/
		
		//=============== for date modification ============
		/*SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, "date", editor);*/
	}

}
