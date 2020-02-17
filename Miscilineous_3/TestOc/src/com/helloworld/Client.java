package com.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring.xml");
		BeanFactory beanFac = new XmlBeanFactory(r);
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
//		HelloWorld h = (HelloWorld)ap.getBean("t");
//		h.printMessage();
//		h.printMessage();
//		HelloWorld h1 = (HelloWorld)ap.getBean("t");
//		h1.printMessage();


//		PrimitiveArraySetterInjection psi =(PrimitiveArraySetterInjection) ap.getBean("arraySI");
//		String[] names = psi.getNames();
//		for(String name: names) {
//			System.out.println(name);
//		}
//	//	h.printMessage();
//		Car car = (Car)ap.getBean("car");
//		car.printEngines();
//		SpecificDataType specific = (SpecificDataType)ap.getBean("specific");
//		specific.printData();
//		
//		MapTest map = (MapTest)ap.getBean("map");
//		System.out.println(map.getMap());

	}

}
