package com.eureka.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * 
 * @author Shrikant Barkul 
 * This is the main spring boot class.
 * @EnableEurekaServer enables eureka server.
 *  
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	/***
	 * main method of the spring boot application 
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
