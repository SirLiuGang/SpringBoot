package com.zhbr.spring_boot_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 
 * 目的：
 * 		简化新Spring应用的初始化搭建以及开发过程。
 * 		该框架使用了特定的方法来进行配置，从而使开发人员不再需要定义样板化的配置。
 * 特性：
 * 		1.创建独立的Spring应用程序
 * 		2.嵌入式的Tomcat，无需部署WAR文件
 * 		3.简化Maven配置
 * 		4.自动配置Spring
 * 		5.提供生产就绪型功能，如指标，健康检查和外部配置
 * 		6.开箱即用，没有代码生成，也无需XML配置
 */
// 在这里使用@SpringBootApplication指定这是一个Spring的应用程序
@SpringBootApplication
public class APP {
	
	/**
	 * 在main方法中启动应用程序
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
