package com.zys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * zuul网关启动类
 * @author ASUS
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  //:开启网关的注解  如果不开启，将不能访问指定的服务
public class ZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);

	}

}
