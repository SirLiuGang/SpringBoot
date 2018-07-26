package com.zhbr.spring_boot_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

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
public class APP /*extends WebMvcConfigurerAdapter*/{
	// 引入fastjson的第一种方法
	/*@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		*//**
		 * 1.需先定义一个convert转换消息的对象
		 * 2.添加fastJson 的配置信息，比如：是否要格式化返回的json数据
		 * 3.在convert中添加配置信息
		 * 4.将convert添加到converters中
		 *//*
		// 定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		// 添加fastJson 的配置信息
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		// 在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		// 将convert添加到converters中
		converters.add(fastConverter);
	}*/
	
	// 引入fastjson的第二种方法
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		// 添加fastJson 的配置信息
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		// 在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		// 
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
	
	/**
	 * 在main方法中启动应用程序
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
