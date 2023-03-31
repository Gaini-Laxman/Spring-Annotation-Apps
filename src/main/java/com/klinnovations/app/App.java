package com.klinnovations.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klinnovations.config.AppConfig;

public class App {
	
public static void main(String[] args) {
	ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
}
}
