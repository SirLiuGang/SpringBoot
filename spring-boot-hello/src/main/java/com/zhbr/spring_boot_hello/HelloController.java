package com.zhbr.spring_boot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *	Codeing步骤：
 *		新建一个Controller类
 *		新建测试启动类（App-Main方法）
 *		测试代码
 */
// 等价于@Controller 和 @ResponseBody
@RestController
public class HelloController {
    
	/**
	 * 在这里我们使用@RequestMapping建立请求映射
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello2";
	}
}























