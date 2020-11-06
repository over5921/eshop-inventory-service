package com.roncoo.eshop.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 库存服务
 * @author 41241
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EshopInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EshopInventoryServiceApplication.class, args); 
	}
	
}
