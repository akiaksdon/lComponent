package com.example.samples.lComponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.samples.lComponent.bean.RandomNameGenerator;

@Component
public class MyRunner implements CommandLineRunner {
    
	 private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	    @Autowired
	    private RandomNameGenerator randGenerator;

	    @Override
	    public void run(String... args) throws Exception {
	        
	        logger.info("Generating random name: {}", randGenerator.generate());
	        logger.info("Generating random name: {}", randGenerator.generate());
	        logger.info("Generating random name: {}", randGenerator.generate());
	    }
}