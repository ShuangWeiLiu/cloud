package com.lsw.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * Spring could web程序主入口 怎么是这个注释启动？ 
 * @author Administrator 
 * 
 */
//@SpringBootApplication
@Configuration//配置控制    
@EnableAutoConfiguration//启用自动配置    
@ComponentScan(value={"com.caicongyang.springCloudApp"})//组件扫描    
@EnableDiscoveryClient 
public class CloudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAppApplication.class, args);
	}
}
