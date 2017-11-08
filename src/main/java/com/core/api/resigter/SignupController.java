package com.core.api.resigter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.core.CoreApiConstant;

@RestController
@RequestMapping(value =CoreApiConstant.REGISTER_ENDPOINT)
public class SignupController {

	@RequestMapping(value=CoreApiConstant.INITIATE_ENDPOINT,
			method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void initiate(HttpServletRequest request, HttpServletResponse response){
		System.out.println("initiate Service");
	}
	
	
	@RequestMapping(value="/test",
			method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void initiate1(HttpServletRequest request, HttpServletResponse response){
		System.out.println("initiate1 Service");
	}
	
	@RequestMapping(value=CoreApiConstant.CHECK_ENDPOINT,
			method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void checkUserNameEmail(@RequestBody Register register,
			HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("checkUserNameEmail Service");
		
	}
	
	@RequestMapping(value=CoreApiConstant.SIGNUP_ENDPOINT,
			method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void signup(@RequestBody Register register,
			HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("signup Service");
		
	}
	
	@RequestMapping(value=CoreApiConstant.VERIFY_ENDPOINT,
			method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void verify(@RequestBody Register register,
			HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("verify Service");
		
	}
}
