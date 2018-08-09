package com.zhbr.spring_boot_hello.g.serverconfig;

/**
 * 配置Server信息
 * 	1、修改端口号
 * 		修改application.properties文件，在文件中加入：
 * 			server.port=8081
 * 	2、修改context-path
 * 		在application.properties中进行配置：
 * 			server.context-path=/spring-boot-hello
 * 			访问地址就是http://ip:port/spring-boot-hello
 * 	3、其他配置
 * 		#server.port=8080
		#server.address = # bind to a specific NIC
		#server.session-timeout = # session timeout in seconds
		# 上下文地址 the context path, defaults to '/'
		#server.context-path = /spring-boot
		#server.servlet-path = # the servlet path, defaults to '/'
		##server.tomcat.access-log-pattern = # log pattern of the access log
		##server.tomcat.access-log-enabled = false # is access logging enabled
		#server.tomcat.protocol-header = x-forwarded-proto # ssl forward headers
		#server.tomcat.remote-ip-header = x-forwarded-for
		#server.tomcat.basedir = /tmp # base dir (ususlly not needed, defaults to tmp)
		#server.tomcat.background-processor-delay = 30 # in seconds
		#server.tomcat.max-threads = 0 # number of threads in protocol handler
		#server.tomcat.uri-encoding = UTF-8 # character encoding to use for URL decoding
 */
public class ServerConfig {

}
