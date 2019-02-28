package com.ryaltech.m1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SomethingUseful{
	private static final Logger logger = LoggerFactory.getLogger(SomethingUseful.class);
	public void doit(){
		//purely for dependency use purposes
		logger.info("Something useful is called ...");
	}
}