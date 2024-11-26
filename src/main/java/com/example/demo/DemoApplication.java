package com.example.demo;

import com.example.demo.controller.PizzaController;
import com.example.demo.service.CustomPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		PizzaController pizzaCtrl = appContext.getBean(PizzaController.class);
		System.out.println(pizzaCtrl.getPizza());


	}

}
