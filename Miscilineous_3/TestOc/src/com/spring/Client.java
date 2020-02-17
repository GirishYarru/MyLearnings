package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		//core container
//		Resource resource =  new ClassPathResource("Spring_IOC.xml");
//		BeanFactory beans = new XmlBeanFactory(resource);
//		HelloWorld hello = (HelloWorld)beans.getBean("hello");
//		hello.printMessage();
		
		//J2ee container
		ApplicationContext applcnCntxt = new ClassPathXmlApplicationContext("Spring_IOC.xml");
		HelloWorld hello = (HelloWorld)applcnCntxt.getBean("hello");
		HelloWorld helloTest = (HelloWorld)applcnCntxt.getBean("hello1");
		//helloTest.setName("test");
		System.out.println(" ****************** one *** "+hello.getName() );
		
		System.out.println("***********two ***** "+ helloTest.getName());
		
		HelloWorld hello1 = (HelloWorld)applcnCntxt.getBean("hello");

		
		
		
//
		
//		HelloWorld hello1 = (HelloWorld)applcnCntxt.getBean("hello1");
//		hello.setName("abc");
//		hello1.getName();
//		System.out.println(hello1.getName()+" hello1");
//		System.out.println(hello.getName()+" hello");

		
//
//		hello.printMessage();
//		hello1.printMessage();

	}

	

}
