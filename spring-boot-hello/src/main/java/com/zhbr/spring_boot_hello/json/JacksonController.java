package com.zhbr.spring_boot_hello.json;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacksonController {

	/**
	 * Springboot默认使用的json解析框架是jackson
	 */
	/**
	 * 获取Demo的Json格式
	 * @return
	 */
	@RequestMapping("getJsonDemo")
	public Demo getJsonDemo() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三");
		demo.setCreateTime(new Date());
		demo.setRemarks("这是备注信息，不被返回");
		return demo;
	}
	
}
