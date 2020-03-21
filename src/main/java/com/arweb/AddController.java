package com.arweb;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

@Controller  
public class AddController {

	@RequestMapping("/add")  
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response)  
    {  
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		int res=n1+n2;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", res);
		
        return mv;  
    }     
}

