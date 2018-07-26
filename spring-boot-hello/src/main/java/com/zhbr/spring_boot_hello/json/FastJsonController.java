package com.zhbr.spring_boot_hello.json;

/**
 * 引入fastjson依赖库
 * 配置fastjson（支持两种方法）
 * 	方法一：
 * 		1.启动类继承extends WebMvcConfigurerAdapter
 * 		2.覆盖方法configureMessageConverters
 * 		(在Demo中增加Date日期，添加@JSONField注解中的format属性进行格式化日期)
 * 	方法二：
 * 		注入Bean：HttpMessageConverters
 */
/**
  	<dependency>
		<groupId>com.alibaba</groupId>
		<artifactId>fastjson</artifactId>
		<version>1.2.15</version>
	</dependency>
 */
public class FastJsonController {

}
