package com.spring.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
    SpringAnnot annotation = (SpringAnnot) cont.getBean("annot");
    annotation.display();
	}

}
