package com.zhbr.spring_boot_hello.e.globalexception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常捕捉
 * 	1.新建Class，这里取名为GlobalDefaultExceptionHandler
 *	2.在class注解上加@ControllerAdvice
 *	3.在Class的方法上加@ExceptionHandler(Exception.class)拦截异常
 *	4.如果返回的是View -- 方法的返回值是ModelAndView
 *	5.如果返回的是String或Json数据，需要在方法上添加@ResponseBody注解
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
		// 返回String
		return "服务器繁忙";
		
//		// 返回ModelAndView
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName(viewName);
		
	}
}
