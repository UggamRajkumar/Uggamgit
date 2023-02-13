package com.lombok.spring_Lombok.entity;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class Lapcontroller {
	
	//private final static Logger LOGGER=LoggerFactory.getLogger(Lapcontroller.class);
	@Autowired
	private Laprepo laprepo;
	@PostMapping("savelap")
	public void savelap(@RequestBody Laptop laptop) {
		Laptop lp= laprepo.save(laptop);
		//LOGGER.info("user data-->"+laptop);
	log.info(null);
	
	}

}
