package com.zhbr.spring_boot_hello.h.thymeleaf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 在Thymeleaf 模板文件中，标签需要闭合的，3.0之前需要闭合，3.0之后是可以不强制要求闭合
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {

	/**
	 * 映射地址是/templates/helloHtml
	 * @return
	 */
	@RequestMapping("/helloHtml")
	public ModelAndView helloHtml(Map<String, Object> map) {
		// 返回的是ModeAndView对象
		// 参数是view的名称
		ModelAndView mv = new ModelAndView("hello");
		map.put("name", "LiuGang");
		return mv;
	}
}













