package com.love.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.love.business.entity.Admin;
import com.love.business.service.IAdminService;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	private IAdminService adminService;
	
	@Value("${jdbc.driverClassName}")
	private String driver_name;
	/*@RequestMapping("/success")//jsp
	public ModelAndView success(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "welcome to computer world");
		mv.setViewName("success");
		return mv;
				
	}*/
	
	//framemarker
	@RequestMapping("/success")
	public ModelAndView success(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "welcome to computer world");
		Admin admin = adminService.query("admin");
		mv.addObject("admin", admin);
		
		System.out.println(driver_name);
		mv.setViewName("success");
		return mv;
				
	}
}
