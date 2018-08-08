package com.zhbr.spring_boot_hello.d.jdbctemplate;

/**
 * Spring Boot JdbcTemplate
 * 	1.在pom.xml加入jdbcTemplate的依赖
 * 	2.编写DemoDao类，声明为：@Repository，引入JdbcTemplate
 * 	3.编写DemoService类，引入DemoDao进行使用
 * 	4.编写Demo2Controller进行简单测试
 */
public class JdbcTemplate_Main {

	/**
	 * 使用方式：
	 * 	在需要使用的类中加入：
	 * 	@Resource
	 * 	private JdbcTemplate jdbcTemplate
	 */
}
