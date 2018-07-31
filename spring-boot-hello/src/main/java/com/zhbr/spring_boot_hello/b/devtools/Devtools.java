package com.zhbr.spring_boot_hello.b.devtools;

/**
 * 问题背景：通过使用springloaded进行热部署，但是有些代码修改了，并不会进行热部署
 * 
 * 原理：在发现代码有更改之后，重新启动应用，但是速度比手动停止后再启动还要更快，更快指的不是节省出来的手工操作的时间
 * 
 * 深层原理：使用了两个ClassLoader，一个ClassLoader加载那些不会改变的类（第三方jar包），另一个ClassLoader加载会更改的类，称为restart ClassLoader
 * 			这样在有代码更改的时候，原来的restart ClassLoader被丢弃，重新创建一个新的restart ClassLoader，由于需要加载的类相对比较少，所以实现了较快的重启时间（5秒以内）
 * 
 * 修改类-->保存：应用会重启
 * 修改配置文件-->保存：应用会重启
 * 修改页面-->保存：应用会重启，页面会刷新（原理是将spring.thymeleat.cache设为false）
 */
public class Devtools {
	/*实现方法：
		一：引入依赖包：
			<!-- 引入springboot devtools的依赖包，用于热部署（修改了方法后也可以快速部署） -->
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-devtools</artifactId>
				<optional>true</optional>
				<scope>true</scope>
			</dependency>
		二：引入插件：
			<!-- 这是springboot devtools plugin -->
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<!-- fork：如果没有配置该项，那个devtools不会起作用，即应用不会restart -->
					<fork>true</fork>
				</configuration>
			</plugin>*/
}

















